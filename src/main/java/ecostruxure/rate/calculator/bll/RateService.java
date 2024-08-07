package ecostruxure.rate.calculator.bll;

import ecostruxure.rate.calculator.be.Profile;
import ecostruxure.rate.calculator.be.Team;
import ecostruxure.rate.calculator.be.enums.AdjustmentType;
import ecostruxure.rate.calculator.be.enums.RateType;
import ecostruxure.rate.calculator.be.data.Rates;
import ecostruxure.rate.calculator.be.data.TeamMetrics;
import ecostruxure.rate.calculator.bll.service.ProfileService;
import ecostruxure.rate.calculator.bll.service.TeamService;
import ecostruxure.rate.calculator.bll.utils.RateUtils;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;

/**
 * RateServices funktionalitet er at udregne priser/lønninger for teams og profiler.
 */
public class RateService {
    private static final int SCALE = 2;
    private static final int PRECISION = 8;
    private static final RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;

    // Services til at håndtere profiles og teams
    private final ProfileService profileService;
    private final TeamService teamService;

    // Constructor der initialiserer services
    public RateService() throws Exception {
        this.profileService = new ProfileService();
        this.teamService = new TeamService();
    }

    // Metode til at udregne rates for et team, baseret på rate typen.
    public Rates calculateRates(Team team, RateType rateType) throws Exception {
        var rawRate = BigDecimal.ZERO;
        var markup = team.markup();
        var grossMargin = team.grossMargin();

        // Bestemme raw rate ud fra hvilken rate type der er valgt
        switch (rateType) {
            case HOURLY -> rawRate = utilizedHourlyRate(team);
            case DAY -> rawRate = utilizedDayRate(team);
            case ANNUAL -> rawRate = utilizedAnnualCost(team);
        }

        // Tilføjer markup og gross margin til raw rate
        var markupRate = applyMarkup(rawRate, markup);
        var grossMarginRate = applyGrossMargin(markupRate, grossMargin);

        //Aflevere den udregnede rate.
        return new Rates(rawRate, markupRate, grossMarginRate);
    }

    // Metode til at udregne den udnyttede hourly rate for et team
    public BigDecimal utilizedHourlyRate(Team team) throws Exception {
        var total = BigDecimal.ZERO;

        // Henter profilerne for et team og udregner den sammenlagte hourly rate.
        var profiles = teamService.getTeamProfiles(team);
        for (Profile profile : profiles) {
            var utilizationRate = profileService.getProfileRateUtilizationForTeam(profile.id(), team.id());
            total = total.add(RateUtils.hourlyRate(profile, utilizationRate));
        }

        return total;
    }

    // Metode til at udregne den udnyttede day rate for et team
    public BigDecimal utilizedDayRate(Team team) throws Exception {
        var total = BigDecimal.ZERO;

        // Henter profilerne for et team og udregner den sammenlagte day rate.
        var profiles = teamService.getTeamProfiles(team);
        for (Profile profile : profiles) {
            var utilizationRate = profileService.getProfileRateUtilizationForTeam(profile.id(), team.id());
            total = total.add(RateUtils.dayRate(profile, utilizationRate));
        }

        return total;
    }

    // Metode til at udregne den udnyttede årlige omkostning for et team
    public BigDecimal utilizedAnnualCost(Team team) throws Exception {
        var total = BigDecimal.ZERO;

        // Henter profilerne for et team og udregner den sammenlagte årlige omkostning.
        var profiles = teamService.getTeamProfiles(team);
        for (Profile profile : profiles) {
            var utilizationRate = profileService.getProfileRateUtilizationForTeam(profile.id(), team.id());
            total = total.add(RateUtils.annualCost(profile, utilizationRate));
        }

        return total;
    }

    // Metode til at udregne rate for et team baseret på rate type og adjustment type
    public BigDecimal calculateRate(Team team, RateType rateType, AdjustmentType adjustmentType) throws Exception {
        var profiles = profileService.allByTeam(team);

        var totalBaseRate = BigDecimal.ZERO;
        var totalAdjustedRate = BigDecimal.ZERO;
        var markup = team.markup();
        var grossMargin = team.grossMargin();

        // Bestemme total base rate ud fra hvilken rate type der er valgt
        switch (rateType) {
            case HOURLY -> totalBaseRate = profileService.hourlyRate(profiles);
            case DAY -> totalBaseRate = profileService.dayRate(profiles);
            case ANNUAL -> totalBaseRate = profileService.annualCost(profiles);
        }

        switch (adjustmentType) {
            case RAW -> totalAdjustedRate = totalBaseRate;
            case MARKUP -> totalAdjustedRate = applyMarkup(totalBaseRate, markup);
            case GROSS_MARGIN -> totalAdjustedRate = applyGrossMargin(applyMarkup(totalBaseRate, markup), grossMargin);
        }

        return totalAdjustedRate;
    }

    // Metode til at udregne Metrics for et team
    public TeamMetrics calculateMetrics(Team team) throws Exception {
        return calculateMetrics(team.id(), teamService.getTeamProfiles(team));
    }

    // Metode til at udregne metrics for et team baseret på team id og en liste af profiler
    public TeamMetrics calculateMetrics(int teamId, List<Profile> profiles) throws Exception {
        BigDecimal hourlyRate = BigDecimal.ZERO;
        BigDecimal dayRate = BigDecimal.ZERO;
        BigDecimal annualCost = BigDecimal.ZERO;
        BigDecimal totalHours = BigDecimal.ZERO;

        // Udregner de totale rates og timer for profilerne
        for (Profile profile : profiles) {
            BigDecimal utilizationRate = profileService.getProfileRateUtilizationForTeam(profile.id(), teamId);
            BigDecimal utilizationHours = profileService.getProfileHourUtilizationForTeam(profile.id(), teamId);

            hourlyRate = hourlyRate.add(profileService.hourlyRate(profile, utilizationRate));
            dayRate = dayRate.add(profileService.dayRate(profile, utilizationRate));
            annualCost = annualCost.add(profileService.annualCost(profile, utilizationRate));
            totalHours = totalHours.add(profileService.effectiveWorkHoursPercentage(profile, utilizationHours));
        }

        return new TeamMetrics(hourlyRate, dayRate, annualCost, totalHours);
    }

    /**
     * Calculated as follows:
     * result = rate * (1 + (markup / 100))
     *
     * @param markup percentage given as a number between 0 and 100
     * @return rate with markup applied.
     */
    // Metode til at tilføje markup til en rate
    BigDecimal applyMarkup(BigDecimal rate, BigDecimal markup) {
        var mc = new MathContext(PRECISION, ROUNDING_MODE);
        var markupFactor = markup.divide(new BigDecimal("100.00"), mc);
        var result = rate.multiply(BigDecimal.ONE.add(markupFactor));
        return result.setScale(SCALE, ROUNDING_MODE);
    }

    /**
     * Calculated as follows:
     * Gross margin percentage: gmPercent = gm / 100
     * Gross margin factor: gmFactor = 1 - gmPercent
     * Result = rate / gmFactor, which is same as rate * (1 / gmFactor)
     *
     * @param grossMargin percentage given as a number between 0 and 100
     * @return rate with gross margin applied.
     */
    // Metode til at tilføje gross margin til en rate
    BigDecimal applyGrossMargin(BigDecimal rate, BigDecimal grossMargin) {
        var mc = new MathContext(PRECISION, ROUNDING_MODE);
        var grossMarginPercentage = grossMargin.divide(new BigDecimal("100"), mc);
        var grossMarginFactor = BigDecimal.ONE.subtract(grossMarginPercentage);

        BigDecimal result;
        if (grossMarginFactor.compareTo(BigDecimal.ZERO) == 0) result = rate.multiply(new BigDecimal("2.00"));
        else result = rate.divide(grossMarginFactor, mc);

        return result.setScale(SCALE, ROUNDING_MODE);
    }
}
