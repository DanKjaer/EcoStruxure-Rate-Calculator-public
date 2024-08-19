package ecostruxure.rate.calculator.gui.component.modals.assignprofile;

import ecostruxure.rate.calculator.be.Profile;
import ecostruxure.rate.calculator.be.Team;
import ecostruxure.rate.calculator.bll.service.GeographyService;
import ecostruxure.rate.calculator.bll.service.ProfileService;
import ecostruxure.rate.calculator.bll.service.TeamService;
import ecostruxure.rate.calculator.gui.component.modals.addteam.AddProfileItemModel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class AssignProfileInteractor {
    private final AssignProfileModel model;
    private TeamService teamService;

    private ProfileService profileService;
    private GeographyService geographyService;
    private List<AddProfileItemModel> profileItemModels;

    public AssignProfileInteractor(AssignProfileModel model, Runnable onFetchError) {
        this.model = model;

        try {
            teamService = new TeamService();
            profileService = new ProfileService();
            geographyService = new GeographyService();
        } catch (Exception e) {
            onFetchError.run();
        }

        model.okToSaveProperty().set(true);
    }

    private List<AddProfileItemModel> convertToProfileItemModels(List<Profile> profiles, int teamId) throws Exception {
        List<AddProfileItemModel> profileItemModels = new ArrayList<>();
        List<Profile> profilesTeams = teamService.getTeamProfiles(teamId);

        for (Profile profile : profiles) {
            AddProfileItemModel profileItemModel = new AddProfileItemModel();
            boolean isProfileInTeam = profilesTeams.stream()
                    .anyMatch(profileTeam -> profileTeam.getProfileId() == profile.getProfileId());

            if (!isProfileInTeam && !profileService.shouldProcessUtilization(profile.getCostAllocation()) && !profileService.shouldProcessUtilization(profile.getHourAllocation()))
                continue;

            profileItemModel.setIdProperty(profile.getProfileId());
            profileItemModel.nameProperty().set(profile.getName());
            profileItemModel.selectedProperty().set(isProfileInTeam);

            BigDecimal profileCostAllocation = profileService.getProfileCostAllocationForTeam(profile.getProfileId(), teamId);
            profileItemModel.currentCostAllocationProperty().set(new BigDecimal(100).subtract(profile.getCostAllocation()).add(profileCostAllocation));
            profileItemModel.setCostAllocationProperty().set(profileCostAllocation);

            BigDecimal profileHourAllocation = profileService.getProfileHourAllocationForTeam(profile.getProfileId(), teamId);
            profileItemModel.currentHourAllocationProperty().set(new BigDecimal(100).subtract(profile.getHourAllocation()).add(profileHourAllocation));
            profileItemModel.setHourAllocationProperty().set(profileHourAllocation);

            profileItemModel.locationProperty().set(geographyService.get(profile.profileData().geography()).name());

            profileItemModels.add(profileItemModel);
        }

        return profileItemModels;
    }


    private boolean isDataValid() {
        return model.profiles().stream()
                .anyMatch(profile -> profile.wasChangedProperty().get());
    }

    private Profile createProfileFromModel(AddProfileItemModel model) {
        var profile = new Profile();
        profile.setProfileId(model.getUUID());
        profile.setName((model.nameProperty().get()));

        profile.setCostAllocation(model.setCostAllocationProperty().get());
        profile.setHourAllocation(model.setHourAllocationProperty().get());

        return profile;
    }

    private Team createTeamFromModel(AssignProfileModel model) {
        return new Team(model.teamIdProperty().get());
    }

    public boolean assignProfiles() {
        try {
            Team team = createTeamFromModel(model);

            List<AddProfileItemModel> currentSelectedProfiles = getSelectedProfiles(model.profiles());
            List<AddProfileItemModel> originalSelectedProfiles = getSelectedProfiles(model.originalProfiles());

            List<Profile> profilesToInsert = getProfilesToInsert(currentSelectedProfiles, originalSelectedProfiles);
            List<Profile> profilesToDelete = getProfilesToDelete(currentSelectedProfiles, originalSelectedProfiles);
            List<Profile> profilesToUpdate = getProfilesToUpdate(currentSelectedProfiles, originalSelectedProfiles);

            boolean shouldInsert = profilesToInsert.isEmpty() || teamService.assignProfiles(team, profilesToInsert);
            boolean shouldDelete = profilesToDelete.isEmpty() || teamService.removeAssignedProfiles(team, profilesToDelete);
            boolean shouldUpdate = profilesToUpdate.isEmpty() || teamService.updateProfiles(team, profilesToUpdate);

            return shouldInsert && shouldDelete && shouldUpdate;
        } catch (Exception e) {
            return false;
        }
    }

    private List<AddProfileItemModel> getSelectedProfiles(List<AddProfileItemModel> profiles) {
        return profiles.stream()
                .filter(profile -> profile.selectedProperty().get())
                .collect(Collectors.toList());
    }

    /**
     * Get the profiles that are selected in the current profiles list but not in the original profiles list
     *
     * @param currentSelectedProfiles   The current selected profiles
     * @param originalSelectedProfiles  The original selected profiles
     * @return The profiles to insert
     */
    private List<Profile> getProfilesToInsert(List<AddProfileItemModel> currentSelectedProfiles, List<AddProfileItemModel> originalSelectedProfiles) {
        return currentSelectedProfiles.stream()
                .filter(currentProfile ->
                        originalSelectedProfiles.stream()
                                // Tjek if der ikke er et match i den originale liste
                                .noneMatch(originalProfile ->
                                        // Tjek om IDer er ens og om den originale profil er selected
                                        originalProfile.getUUID() == currentProfile.getUUID() &&
                                                originalProfile.selectedProperty().get()))
                .map(this::createProfileFromModel)
                .collect(Collectors.toList());
    }

    /**
     * Get the profiles that are selected in the original profiles list but not in the current profiles list
     *
     * @param currentSelectedProfiles   The current selected profiles
     * @param originalSelectedProfiles  The original selected profiles
     * @return The profiles to delete
     */
    private List<Profile> getProfilesToDelete(List<AddProfileItemModel> currentSelectedProfiles, List<AddProfileItemModel> originalSelectedProfiles) {
        return originalSelectedProfiles.stream()
                // Filter de originale profiler, så kun de selectede er tilbage
                .filter(originalProfile -> originalProfile.selectedProperty().get())
                // Filter ud de originale profiler som ikke er valgt i current profiles
                .filter(originalProfile -> !currentSelectedProfiles.contains(originalProfile) &&
                        !currentSelectedProfiles.stream().anyMatch(currentProfile ->
                                currentProfile.getUUID() == originalProfile.getUUID()))
                .map(this::createProfileFromModel)
                .collect(Collectors.toList());
    }

    /**
     * Get the profiles that are selected in the current profiles list and the utilization is different from the original profiles list
     *
     * @param currentSelectedProfiles   The current selected profiles
     * @param originalSelectedProfiles  The original selected profiles
     * @return The profiles to update
     */
    private List<Profile> getProfilesToUpdate(List<AddProfileItemModel> currentSelectedProfiles, List<AddProfileItemModel> originalSelectedProfiles) {
        return currentSelectedProfiles.stream()
                .filter(currentProfile -> {
                    // Find den originale profil som passer til den nuværende profil
                    AddProfileItemModel originalProfile = findProfileById(originalSelectedProfiles, currentProfile.getUUID());
                    return originalProfile != null && currentProfile.selectedProperty().get();
                })
                // Filter nuværende profiler hvor setUtilization er forskellig fra original
                .filter(currentProfile -> {
                    // Få fat i den originle profil som passer til den nuværende
                    AddProfileItemModel originalProfile = findProfileById(originalSelectedProfiles, currentProfile.getUUID());
                    return !currentProfile.setCostAllocationProperty().get().equals(originalProfile.setCostAllocationProperty().get()) ||
                            !currentProfile.setHourAllocationProperty().get().equals(originalProfile.setHourAllocationProperty().get());
                })
                .map(this::createProfileFromModel)
                .collect(Collectors.toList());
    }

    /**
     * Find a profile by ID
     *
     * @param profiles  The profiles to search in
     * @param id        The ID to search for
     * @return The profile if found, otherwise null
     */
    private AddProfileItemModel findProfileById(List<AddProfileItemModel> profiles, UUID id) {
        return profiles.stream()
                .filter(profile -> profile.getUUID() == id)
                .findFirst()
                .orElse(null);
    }


    public Boolean fetchProfiles(int teamId) {
        try {
            List<Profile> profiles = profileService.allWithUtilization();
            profileItemModels = convertToProfileItemModels(profiles, teamId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Copy the current profiles to the original profiles
     */
    private void copyToOriginal() {
        List<AddProfileItemModel> copiedOriginalProfiles = new ArrayList<>();

        for (AddProfileItemModel originalProfile : profileItemModels) {
            AddProfileItemModel copiedProfile = new AddProfileItemModel();
            copiedProfile.setIdProperty(originalProfile.getUUID());
            copiedProfile.nameProperty().set(originalProfile.nameProperty().get());
            copiedProfile.setCostAllocationProperty().set(originalProfile.setCostAllocationProperty().get());
            copiedProfile.currentCostAllocationProperty().set(originalProfile.currentCostAllocationProperty().get());
            copiedProfile.setHourAllocationProperty().set(originalProfile.setHourAllocationProperty().get());
            copiedProfile.currentHourAllocationProperty().set(originalProfile.currentHourAllocationProperty().get());
            copiedProfile.utilizationPercentageIsValidProperty().set(originalProfile.utilizationPercentageIsValidProperty().get());
            copiedProfile.teamIdProperty().set(originalProfile.teamIdProperty().get());
            copiedProfile.locationProperty().set(originalProfile.locationProperty().get());
            copiedProfile.selectedProperty().set(originalProfile.selectedProperty().get());

            copiedOriginalProfiles.add(copiedProfile);
        }

        model.originalProfiles().setAll(copiedOriginalProfiles);
    }

    public void updateModel() {
        model.profiles().setAll(profileItemModels);
        copyToOriginal();
        model.profilesFetchedProperty().set(true);
    }
}
