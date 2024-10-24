package ecostruxure.rate.calculator.gui.util.constants;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedText {
    public static final ObjectProperty<Locale> CURRENT_LOCALE = new SimpleObjectProperty<>(Locale.ENGLISH);

    public static final StringProperty CURRENT = new SimpleStringProperty("Current");
    public static final StringProperty CSV_DROP_INSTRUCTIONS = new SimpleStringProperty("Drag and drop CSV file here");
    public static final StringProperty HOUR_SYMBOL_LOWERCASE = new SimpleStringProperty("h");
    public static final StringProperty HOUR_SYMBOL_UPPERCASE = new SimpleStringProperty("H");
    public static final StringProperty DASHBOARD = new SimpleStringProperty("Dashboard");
    public static final StringProperty GEOGRAPHY = new SimpleStringProperty("Geography");
    public static final StringProperty PROFILES = new SimpleStringProperty("Profiles");
    public static final StringProperty TEAMS = new SimpleStringProperty("Teams");
    public static final StringProperty CURRENCY = new SimpleStringProperty("Currency");
    public static final StringProperty EUR_CONVERSION_RATE = new SimpleStringProperty("EUR conversion rate");
    public static final StringProperty USD_CONVERSION_RATE = new SimpleStringProperty("USD conversion rate");
    public static final StringProperty CHANGE_CURRENCY = new SimpleStringProperty("Change currency");
    public static final StringProperty CHANGE_THEME = new SimpleStringProperty("Theme selector");
    public static final StringProperty CHANGE_DARK_LIGHT_MODE = new SimpleStringProperty("Change dark/light mode");
    public static final StringProperty CHANGE_LANGUAGE = new SimpleStringProperty("Change language");
    public static final StringProperty ALL = new SimpleStringProperty("All");
    public static final StringProperty COUNTRIES = new SimpleStringProperty("Countries");
    public static final StringProperty GEOGRAPHIES = new SimpleStringProperty("Geographies");
    public static final StringProperty PROFIT = new SimpleStringProperty("Profit");
    public static final StringProperty UTILIZATION  = new SimpleStringProperty("Utilization");
    public static final StringProperty COST_ALLOCATION = new SimpleStringProperty("Cost allocation");
    public static final StringProperty HOUR_ALLOCATION = new SimpleStringProperty("Hour allocation");
    public static final StringProperty ALLOCATED_HOURS = new SimpleStringProperty("Allocated hours");
    public static final StringProperty HISTORY = new SimpleStringProperty("History");
    public static final StringProperty ANNUAL_COST = new SimpleStringProperty("Annual cost");
    public static final StringProperty COST_ON_TEAM = new SimpleStringProperty("Cost on team");
    public static final StringProperty ANNUAL_TOTAL_HOURS = new SimpleStringProperty("Annual hours");
    public static final StringProperty PAGE_DASHBOARD_HEADER = new SimpleStringProperty("Dashboard");
    public static final StringProperty PAGE_DASHBOARD_DESCRIPTION = new SimpleStringProperty("Details provided by the different categories.");
    public static final StringProperty PAGE_PROFILES_DESCRIPTION = new SimpleStringProperty("Define and see stats of profiles.");
    public static final StringProperty PAGE_TEAMS_DESCRIPTION = new SimpleStringProperty("Define and see stats of teams.");
    public static final StringProperty PAGE_TEAM_DESCRIPTION = new SimpleStringProperty("See detailed information about the team.");
    public static final StringProperty PAGE_GEOGRAPHY_DESCRIPTION = new SimpleStringProperty("Geographical locations defined by user.");
    public static final StringProperty NUM_TEAMS = new SimpleStringProperty("Number of teams");
    public static final StringProperty RAW_HOURLY_RATE = new SimpleStringProperty("Raw hourly rate");
    public static final StringProperty MARKUP_HOURLY_RATE = new SimpleStringProperty("Markup hourly rate");
    public static final StringProperty GM_HOURLY_RATE = new SimpleStringProperty("GM hourly rate");
    public static final StringProperty RAW_DAY_RATE = new SimpleStringProperty("Raw day rate");
    public static final StringProperty MARKUP_DAY_RATE = new SimpleStringProperty("Markup day rate");
    public static final StringProperty GM_DAY_RATE = new SimpleStringProperty("GM day rate");
    public static final StringProperty RAW_ANNUAL_COST = new SimpleStringProperty("Raw annual cost");
    public static final StringProperty MARKUP_ANNUAL_COST = new SimpleStringProperty("Markup annual cost");
    public static final StringProperty GM_ANNUAL_COST = new SimpleStringProperty("GM annual cost");
    public static final StringProperty HOURLY_RATE = new SimpleStringProperty("Hourly rate");
    public static final StringProperty DAY_RATE = new SimpleStringProperty("Day rate");
    public static final StringProperty HOURS = new SimpleStringProperty("Hours");
    public static final StringProperty HOURS_ON_TEAM = new SimpleStringProperty("Hours on team");
    public static final StringProperty LOADING = new SimpleStringProperty("Loading...");
    public static final StringProperty TEAM_PROFILE_EDIT_TITLE  = new SimpleStringProperty("You are currently editing:");
    public static final StringProperty DATE = new SimpleStringProperty("Date");
    public static final StringProperty HOURS_PER_DAY = new SimpleStringProperty("Hours per day");
    public static final StringProperty TOTAL_HOURLY_RATE = new SimpleStringProperty("Total hourly rate");
    public static final StringProperty TOTAL_TEAMS = new SimpleStringProperty("Total teams");
    public static final StringProperty TOTAL_DAY_RATE = new SimpleStringProperty("Total day rate");
    public static final StringProperty ASSIGNED_PROFILES = new SimpleStringProperty("Assigned profiles");
    public static final StringProperty GEOGRAPHY_LOCATIONS = new SimpleStringProperty("Locations");
    public static final StringProperty UNIQUE_TEAMS = new SimpleStringProperty("Unique teams");
    public static final StringProperty UNIQUE_LOCATIONS = new SimpleStringProperty("Unique locations");
    public static final StringProperty CONTRIBUTED_HOURLY_RATE = new SimpleStringProperty("Cont. hourly rate");
    public static final StringProperty CONTRIBUTED_DAY_RATE = new SimpleStringProperty("Cont. day rate");
    public static final StringProperty CONTRIBUTED_ANNUAL_COST = new SimpleStringProperty("Cont. annual cost");
    public static final StringProperty ANNUAL_HOURS = new SimpleStringProperty("Annual hours");
    public static final StringProperty SEARCH_PROMPT = new SimpleStringProperty("Search");
    public static final StringProperty THEME_SELECTOR = new SimpleStringProperty("Theme selector");
    public static final StringProperty ADD_NEW_PROFILE = new SimpleStringProperty("Add new profile");
    public static final StringProperty ADD_NEW_TEAM = new SimpleStringProperty("Add new team");
    public static final StringProperty ADD_NEW_GEOGRAPHY = new SimpleStringProperty("Add new geography");
    public static final StringProperty ADJUST_MULTIPLIERS = new SimpleStringProperty("Adjust multipliers");
    public static final StringProperty MULTIPLIERS = new SimpleStringProperty("Multipliers");
    public static final StringProperty ASSIGN_PROFILES = new SimpleStringProperty("Assign profiles");
    public static final StringProperty EDIT_TEAM = new SimpleStringProperty("Edit team");
    public static final StringProperty EDIT_TEAM_PROFILE = new SimpleStringProperty("Edit team profile");
    public static final StringProperty GO_BACK = new SimpleStringProperty("Go back");
    public static final StringProperty CREATE = new SimpleStringProperty("Create");
    public static final StringProperty SAVE = new SimpleStringProperty("Save");
    public static final StringProperty CHECKOUT = new SimpleStringProperty("Checkout");
    public static final StringProperty UNDO = new SimpleStringProperty("Undo");
    public static final StringProperty NAME = new SimpleStringProperty("Name");
    public static final StringProperty GEOGRAPHY_NAME = new SimpleStringProperty("Geography name");
    public static final StringProperty LOCATION = new SimpleStringProperty("Location");
    public static final StringProperty TEAM = new SimpleStringProperty("Team");
    public static final StringProperty RESOURCE_TYPE = new SimpleStringProperty("Resource type");
    public static final StringProperty OVERHEAD = new SimpleStringProperty("Overhead");
    public static final StringProperty PRODUCTION = new SimpleStringProperty("Production");
    public static final StringProperty ANNUALLY = new SimpleStringProperty("Annually");
    public static final StringProperty TOTAL_HOURS = new SimpleStringProperty("Total hours");
    public static final StringProperty SALARY = new SimpleStringProperty("Salary");
    public static final StringProperty VERIFY_PROFILES = new SimpleStringProperty("Verify profiles");
    public static final StringProperty VERIFY_PROFILE_UNARCHIVE = new SimpleStringProperty("At least one profile requires changes before unarchiving.");
    public static final StringProperty VERIFY_FOUND_UNARCHIVE = new SimpleStringProperty("Found:");
    public static final StringProperty MODIFIERS = new SimpleStringProperty("Modifiers");
    public static final StringProperty EFFECTIVENESS = new SimpleStringProperty("Effectiveness");
    public static final StringProperty EFFECTIVE_WORK_HOURS = new SimpleStringProperty("Effective work hours");
    public static final StringProperty UTILIZATION_PERCENTAGE = new SimpleStringProperty("Utilization percentage");
    public static final StringProperty RAW = new SimpleStringProperty("Raw");
    public static final StringProperty MARKUP = new SimpleStringProperty("Markup");
    public static final StringProperty GROSS_MARGIN = new SimpleStringProperty("Gross margin");
    public static final StringProperty GROSS_MARGIN_ABBREVIATION = new SimpleStringProperty("GM");
    public static final StringProperty NO_PROFILES_FOUND = new SimpleStringProperty("No profiles available");
    public static final StringProperty NO_TEAMS_ON_PROFILE = new SimpleStringProperty("");
    public static final StringProperty TOTAL_HOURS_ANNUALLY = new SimpleStringProperty("Total annual hours");
    public static final StringProperty TOTAL_ANNUAL_COST = new SimpleStringProperty("Total annual cost");
    public static final StringProperty SHOW = new SimpleStringProperty("Show");
    public static final StringProperty EDIT = new SimpleStringProperty("Edit");
    public static final StringProperty DELETE = new SimpleStringProperty("Delete");
    public static final StringProperty REMOVE = new SimpleStringProperty("Remove");
    public static final StringProperty COPY = new SimpleStringProperty("Copy");
    public static final StringProperty EXPORT_TO_FILE = new SimpleStringProperty("Export to file");
    public static final StringProperty EXPORT = new SimpleStringProperty("Export");
    public static final StringProperty TO_FILE = new SimpleStringProperty("to file");
    public static final StringProperty REFRESH = new SimpleStringProperty("Refresh");
    public static final StringProperty ACTIVE = new SimpleStringProperty("Active");
    public static final StringProperty ARCHIVED = new SimpleStringProperty("Archived");
    public static final StringProperty ARCHIVE = new SimpleStringProperty("Archive");
    public static final StringProperty UNARCHIVE = new SimpleStringProperty("Unarchive");
    public static final StringProperty GEOGRAPHY_ADD_AT_LEAST_TWO_COUNTRIES = new SimpleStringProperty("Geography must contain at least 2 countries");
    public static final StringProperty ALREADY_EXISTS = new SimpleStringProperty("already exists");
    public static final StringProperty GEOGRAPHY_DOES_NOT_EXIST = new SimpleStringProperty("Geography doesn't exist");
    public static final StringProperty ERROR_CONNECTION = new SimpleStringProperty("Connection error. Please contact support.");
    public static final StringProperty ERROR_FETCH_TEAMS = new SimpleStringProperty("Failed to fetch teams");
    public static final StringProperty ERROR_FETCH_TEAM = new SimpleStringProperty("Failed to fetch team");
    public static final StringProperty ERROR_FETCH_LOCATIONS = new SimpleStringProperty("Failed to fetch locations");
    public static final StringProperty ERROR_FETCH_COUNTRIES = new SimpleStringProperty("Failed to fetch countries");
    public static final StringProperty ERROR_FETCH_GEOGRAPHIES = new SimpleStringProperty("Failed to fetch geographies");
    public static final StringProperty ERROR_FETCH_PROFILES = new SimpleStringProperty("Failed to fetch profiles");
    public static final StringProperty ERROR_FETCH_PROFILE = new SimpleStringProperty("Failed to fetch profile");
    public static final StringProperty ERROR_FETCH_TEAM_PROFILE = new SimpleStringProperty("Failed to fetch team profile");
    public static final StringProperty ERROR_FETCH_MARKUP = new SimpleStringProperty("Failed to fetch markup");
    public static final StringProperty ERROR_PROFILE_SAVE = new SimpleStringProperty("Failed to save profile");
    public static final StringProperty ERROR_PROFILE_CREATE = new SimpleStringProperty("Failed to create profile");
    public static final StringProperty ERROR_PROFILE_CHECKOUT = new SimpleStringProperty("Failed to checkout profile");
    public static final StringProperty ERROR_PROFILE_ARCHIVE = new SimpleStringProperty("Failed to archive profile");
    public static final StringProperty ERROR_PROFILES_ARCHIVE = new SimpleStringProperty("Failed to archive profiles");
    public static final StringProperty ERROR_PROFILE_UNARCHIVE = new SimpleStringProperty("Failed to unarchive profile");
    public static final StringProperty ERROR_GEOGRAPHY_CREATE = new SimpleStringProperty("Failed to create geography");
    public static final StringProperty ERROR_MARKUP_SAVE = new SimpleStringProperty("Failed to save markup");
    public static final StringProperty ERROR_TEAM_SAVE = new SimpleStringProperty("Failed to save team");
    public static final StringProperty ERROR_TEAM_PROFILE_SAVE = new SimpleStringProperty("Failed to save team profile");
    public static final StringProperty ERROR_TEAM_CREATE = new SimpleStringProperty("Failed to create team");
    public static final StringProperty ERROR_TEAM_ASSIGN = new SimpleStringProperty("Failed to assign profiles");
    public static final StringProperty ERROR_TEAM_ARCHIVE = new SimpleStringProperty("Failed to archive team");
    public static final StringProperty ERROR_TEAMS_ARCHIVE = new SimpleStringProperty("Failed to archive teams");
    public static final StringProperty ERROR_EXPORT_TEAM = new SimpleStringProperty("Failed to export team");
    public static final StringProperty ERROR_EXPORT_TEAMS = new SimpleStringProperty("Failed to export teams");
    public static final StringProperty ERROR_TEAM_PROFILE_REMOVE = new SimpleStringProperty("Failed to remove team profile");
    public static final StringProperty ERROR_FETCH_CURRENCIES = new SimpleStringProperty("Failed to fetch currencies");
    public static final StringProperty ERROR_TEAM_UNARCHIVE = new SimpleStringProperty("Failed to unarchive team");
    public static final StringProperty ERROR_IMPORT_CURRENCIES = new SimpleStringProperty("Failed to import currencies");
    public static final StringProperty ERROR_MISSING_CURRENCIES = new SimpleStringProperty("CSV must contain both EUR and USD entries.");
    public static final StringProperty SUCCESS_PROFILE_CREATED = new SimpleStringProperty("Profile created successfully");
    public static final StringProperty SUCCESS_GEOGRAPHY_CREATED = new SimpleStringProperty("Geography created successfully");
    public static final StringProperty SUCCESS_MULTIPLIERS_SAVED = new SimpleStringProperty("Team multipliers saved successfully");
    public static final StringProperty SUCCESS_TEAM_SAVED = new SimpleStringProperty("Team saved successfully");
    public static final StringProperty SUCCESS_TEAM_PROFILE_SAVED = new SimpleStringProperty("Team profile saved successfully");
    public static final StringProperty SUCCESS_PROFILE_CHECKOUT = new SimpleStringProperty("Profile checked out successfully");
    public static final StringProperty SUCCESS_PROFILE_SAVED = new SimpleStringProperty("Profile saved successfully");
    public static final StringProperty SUCCESS_PROFILE_ARCHIVE = new SimpleStringProperty("Profile archived successfully");
    public static final StringProperty SUCCESS_PROFILES_ARCHIVE = new SimpleStringProperty("Profiles archived successfully");
    public static final StringProperty SUCCESS_PROFILE_UNARCHIVE = new SimpleStringProperty("Profile unarchived successfully");
    public static final StringProperty SUCCESS_MARKUP_SAVED = new SimpleStringProperty("Markup saved successfully");
    public static final StringProperty SUCCESS_TEAM_CREATED = new SimpleStringProperty("Team created successfully");
    public static final StringProperty SUCCESS_ASSIGNED_PROFILES = new SimpleStringProperty("Assigned profiles successfully");
    public static final StringProperty SUCCESS_TEAM_PROFILE_REMOVE = new SimpleStringProperty("Team profile removed successfully");
    public static final StringProperty SUCCESS_TEAM_ARCHIVE = new SimpleStringProperty("Team archived successfully");
    public static final StringProperty SUCCESS_TEAM_UNARCHIVE = new SimpleStringProperty("Team unarchived successfully");
    public static final StringProperty SUCCESS_TEAMS_ARCHIVE = new SimpleStringProperty("Teams archived successfully");
    public static final StringProperty SUCCESS_EXPORT_TEAM = new SimpleStringProperty("Team successfully exported");
    public static final StringProperty SUCCESS_EXPORT_TEAMS = new SimpleStringProperty("Teams successfully exported");
    public static final StringProperty SUCCESS_IMPORT_CURRENCIES = new SimpleStringProperty("Currencies imported successfully!");
    public static final StringProperty REASON = new SimpleStringProperty("Reason for change");
    public static final StringProperty REASON_TEAM_CREATED = new SimpleStringProperty("Team created");
    public static final StringProperty REASON_ASSIGNED_PROFILE = new SimpleStringProperty("Profile assigned");
    public static final StringProperty REASON_REMOVED_PROFILE = new SimpleStringProperty("Profile removed");
    public static final StringProperty REASON_UPDATED_PROFILE = new SimpleStringProperty("Profile updated");
    public static final StringProperty LAST_EDIT = new SimpleStringProperty("Last edit: ");
    public static final StringProperty REASON_UTILIZATION_CHANGE = new SimpleStringProperty("Utilization change");
    public static final StringProperty UPDATED_AT = new SimpleStringProperty("Updated at: ");

    public static void loadBundle(ResourceBundle bundle) {
        CURRENT.set(bundle.getString("CURRENT"));
        CSV_DROP_INSTRUCTIONS.set(bundle.getString("CSV_DROP_INSTRUCTIONS"));
        HOUR_SYMBOL_LOWERCASE.set(bundle.getString("HOUR_SYMBOL_LOWERCASE"));
        HOUR_SYMBOL_UPPERCASE.set(bundle.getString("HOUR_SYMBOL_UPPERCASE"));
        DASHBOARD.set(bundle.getString("DASHBOARD"));
        GEOGRAPHY.set(bundle.getString("GEOGRAPHY"));
        PROFILES.set(bundle.getString("PROFILES"));
        TEAMS.set(bundle.getString("TEAMS"));
        CURRENCY.set(bundle.getString("CURRENCY"));
        EUR_CONVERSION_RATE.set(bundle.getString("EUR_CONVERSION_RATE"));
        USD_CONVERSION_RATE.set(bundle.getString("USD_CONVERSION_RATE"));
        CHANGE_CURRENCY.set(bundle.getString("CHANGE_CURRENCY"));
        CHANGE_THEME.set(bundle.getString("CHANGE_THEME"));
        CHANGE_DARK_LIGHT_MODE.set(bundle.getString("CHANGE_DARK_LIGHT_MODE"));
        CHANGE_LANGUAGE.set(bundle.getString("CHANGE_LANGUAGE"));
        ALL.set(bundle.getString("ALL"));
        COUNTRIES.set(bundle.getString("COUNTRIES"));
        GEOGRAPHIES.set(bundle.getString("GEOGRAPHIES"));
        PROFIT.set(bundle.getString("PROFIT"));
        UTILIZATION.set(bundle.getString("UTILIZATION"));
        COST_ALLOCATION.set(bundle.getString("COST_ALLOCATION"));
        HOUR_ALLOCATION.set(bundle.getString("HOUR_ALLOCATION"));
        ALLOCATED_HOURS.set(bundle.getString("ALLOCATED_HOURS"));
        HISTORY.set(bundle.getString("HISTORY"));
        ANNUAL_COST.set(bundle.getString("ANNUAL_COST"));
        COST_ON_TEAM.set(bundle.getString("COST_ON_TEAM"));
        ANNUAL_TOTAL_HOURS.set(bundle.getString("ANNUAL_TOTAL_HOURS"));
        PAGE_DASHBOARD_HEADER.set(bundle.getString("PAGE_DASHBOARD_HEADER"));
        PAGE_DASHBOARD_DESCRIPTION.set(bundle.getString("PAGE_DASHBOARD_DESCRIPTION"));
        PAGE_PROFILES_DESCRIPTION.set(bundle.getString("PAGE_PROFILES_DESCRIPTION"));
        PAGE_TEAMS_DESCRIPTION.set(bundle.getString("PAGE_TEAMS_DESCRIPTION"));
        PAGE_TEAM_DESCRIPTION.set(bundle.getString("PAGE_TEAM_DESCRIPTION"));
        PAGE_GEOGRAPHY_DESCRIPTION.set(bundle.getString("PAGE_GEOGRAPHY_DESCRIPTION"));
        NUM_TEAMS.set(bundle.getString("NUM_TEAMS"));
        RAW_HOURLY_RATE.set(bundle.getString("RAW_HOURLY_RATE"));
        MARKUP_HOURLY_RATE.set(bundle.getString("MARKUP_HOURLY_RATE"));
        GM_HOURLY_RATE.set(bundle.getString("GM_HOURLY_RATE"));
        RAW_DAY_RATE.set(bundle.getString("RAW_DAY_RATE"));
        MARKUP_DAY_RATE.set(bundle.getString("MARKUP_DAY_RATE"));
        GM_DAY_RATE.set(bundle.getString("GM_DAY_RATE"));
        RAW_ANNUAL_COST.set(bundle.getString("RAW_ANNUAL_COST"));
        MARKUP_ANNUAL_COST.set(bundle.getString("MARKUP_ANNUAL_COST"));
        GM_ANNUAL_COST.set(bundle.getString("GM_ANNUAL_COST"));
        HOURLY_RATE.set(bundle.getString("HOURLY_RATE"));
        DAY_RATE.set(bundle.getString("DAY_RATE"));
        HOURS.set(bundle.getString("HOURS"));
        HOURS_ON_TEAM.set(bundle.getString("HOURS_ON_TEAM"));
        LOADING.set(bundle.getString("LOADING"));
        TEAM_PROFILE_EDIT_TITLE.set(bundle.getString("TEAM_PROFILE_EDIT_TITLE"));
        DATE.set(bundle.getString("DATE"));
        HOURS_PER_DAY.set(bundle.getString("HOURS_PER_DAY"));
        TOTAL_HOURLY_RATE.set(bundle.getString("TOTAL_HOURLY_RATE"));
        TOTAL_TEAMS.set(bundle.getString("TOTAL_TEAMS"));
        TOTAL_DAY_RATE.set(bundle.getString("TOTAL_DAY_RATE"));
        ASSIGNED_PROFILES.set(bundle.getString("ASSIGNED_PROFILES"));
        GEOGRAPHY_LOCATIONS.set(bundle.getString("GEOGRAPHY_LOCATIONS"));
        UNIQUE_TEAMS.set(bundle.getString("UNIQUE_TEAMS"));
        UNIQUE_LOCATIONS.set(bundle.getString("UNIQUE_LOCATIONS"));
        CONTRIBUTED_HOURLY_RATE.set(bundle.getString("CONTRIBUTED_HOURLY_RATE"));
        CONTRIBUTED_DAY_RATE.set(bundle.getString("CONTRIBUTED_DAY_RATE"));
        CONTRIBUTED_ANNUAL_COST.set(bundle.getString("CONTRIBUTED_ANNUAL_COST"));
        ANNUAL_HOURS.set(bundle.getString("ANNUAL_HOURS"));
        SEARCH_PROMPT.set(bundle.getString("SEARCH_PROMPT"));
        THEME_SELECTOR.set(bundle.getString("THEME_SELECTOR"));
        ADD_NEW_PROFILE.set(bundle.getString("ADD_NEW_PROFILE"));
        ADD_NEW_TEAM.set(bundle.getString("ADD_NEW_TEAM"));
        ADD_NEW_GEOGRAPHY.set(bundle.getString("ADD_NEW_GEOGRAPHY"));
        ADJUST_MULTIPLIERS.set(bundle.getString("ADJUST_MULTIPLIERS"));
        MULTIPLIERS.set(bundle.getString("MULTIPLIERS"));
        ASSIGN_PROFILES.set(bundle.getString("ASSIGN_PROFILES"));
        EDIT_TEAM.set(bundle.getString("EDIT_TEAM"));
        EDIT_TEAM_PROFILE.set(bundle.getString("EDIT_TEAM_PROFILE"));
        GO_BACK.set(bundle.getString("GO_BACK"));
        CREATE.set(bundle.getString("CREATE"));
        SAVE.set(bundle.getString("SAVE"));
        CHECKOUT.set(bundle.getString("CHECKOUT"));
        UNDO.set(bundle.getString("UNDO"));
        NAME.set(bundle.getString("NAME"));
        GEOGRAPHY_NAME.set(bundle.getString("GEOGRAPHY_NAME"));
        LOCATION.set(bundle.getString("LOCATION"));
        TEAM.set(bundle.getString("TEAM"));
        RESOURCE_TYPE.set(bundle.getString("RESOURCE_TYPE"));
        OVERHEAD.set(bundle.getString("OVERHEAD"));
        PRODUCTION.set(bundle.getString("PRODUCTION"));
        ANNUALLY.set(bundle.getString("ANNUALLY"));
        TOTAL_HOURS.set(bundle.getString("TOTAL_HOURS"));
        SALARY.set(bundle.getString("SALARY"));
        VERIFY_PROFILES.set(bundle.getString("VERIFY_PROFILES"));
        VERIFY_PROFILE_UNARCHIVE.set(bundle.getString("VERIFY_PROFILE_UNARCHIVE"));
        VERIFY_FOUND_UNARCHIVE.set(bundle.getString("VERIFY_FOUND_UNARCHIVE"));
        MODIFIERS.set(bundle.getString("MODIFIERS"));
        EFFECTIVENESS.set(bundle.getString("EFFECTIVENESS"));
        EFFECTIVE_WORK_HOURS.set(bundle.getString("EFFECTIVE_WORK_HOURS"));
        UTILIZATION_PERCENTAGE.set(bundle.getString("UTILIZATION_PERCENTAGE"));
        RAW.set(bundle.getString("RAW"));
        MARKUP.set(bundle.getString("MARKUP"));
        GROSS_MARGIN.set(bundle.getString("GROSS_MARGIN"));
        GROSS_MARGIN_ABBREVIATION.set(bundle.getString("GROSS_MARGIN_ABBREVIATION"));
        NO_PROFILES_FOUND.set(bundle.getString("NO_PROFILES_FOUND"));
        NO_TEAMS_ON_PROFILE.set(bundle.getString("NO_TEAMS_ON_PROFILE"));
        TOTAL_HOURS_ANNUALLY.set(bundle.getString("TOTAL_HOURS_ANNUALLY"));
        TOTAL_ANNUAL_COST.set(bundle.getString("TOTAL_ANNUAL_COST"));
        SHOW.set(bundle.getString("SHOW"));
        EDIT.set(bundle.getString("EDIT"));
        DELETE.set(bundle.getString("DELETE"));
        REMOVE.set(bundle.getString("REMOVE"));
        COPY.set(bundle.getString("COPY"));
        EXPORT_TO_FILE.set(bundle.getString("EXPORT_TO_FILE"));
        EXPORT.set(bundle.getString("EXPORT"));
        TO_FILE.set(bundle.getString("TO_FILE"));
        REFRESH.set(bundle.getString("REFRESH"));
        ACTIVE.set(bundle.getString("ACTIVE"));
        ARCHIVED.set(bundle.getString("ARCHIVED"));
        ARCHIVE.set(bundle.getString("ARCHIVE"));
        UNARCHIVE.set(bundle.getString("UNARCHIVE"));
        GEOGRAPHY_ADD_AT_LEAST_TWO_COUNTRIES.set(bundle.getString("GEOGRAPHY_ADD_AT_LEAST_TWO_COUNTRIES"));
        ALREADY_EXISTS.set(bundle.getString("ALREADY_EXISTS"));
        GEOGRAPHY_DOES_NOT_EXIST.set(bundle.getString("GEOGRAPHY_DOES_NOT_EXIST"));
        ERROR_CONNECTION.set(bundle.getString("ERROR_CONNECTION"));
        ERROR_FETCH_TEAMS.set(bundle.getString("ERROR_FETCH_TEAMS"));
        ERROR_FETCH_TEAM.set(bundle.getString("ERROR_FETCH_TEAM"));
        ERROR_FETCH_LOCATIONS.set(bundle.getString("ERROR_FETCH_LOCATIONS"));
        ERROR_FETCH_COUNTRIES.set(bundle.getString("ERROR_FETCH_COUNTRIES"));
        ERROR_FETCH_GEOGRAPHIES.set(bundle.getString("ERROR_FETCH_GEOGRAPHIES"));
        ERROR_FETCH_PROFILES.set(bundle.getString("ERROR_FETCH_PROFILES"));
        ERROR_FETCH_PROFILE.set(bundle.getString("ERROR_FETCH_PROFILE"));
        ERROR_FETCH_TEAM_PROFILE.set(bundle.getString("ERROR_FETCH_TEAM_PROFILE"));
        ERROR_FETCH_MARKUP.set(bundle.getString("ERROR_FETCH_MARKUP"));
        ERROR_PROFILE_SAVE.set(bundle.getString("ERROR_PROFILE_SAVE"));
        ERROR_PROFILE_CREATE.set(bundle.getString("ERROR_PROFILE_CREATE"));
        ERROR_PROFILE_CHECKOUT.set(bundle.getString("ERROR_PROFILE_CHECKOUT"));
        ERROR_PROFILE_ARCHIVE.set(bundle.getString("ERROR_PROFILE_ARCHIVE"));
        ERROR_PROFILES_ARCHIVE.set(bundle.getString("ERROR_PROFILES_ARCHIVE"));
        ERROR_PROFILE_UNARCHIVE.set(bundle.getString("ERROR_PROFILE_UNARCHIVE"));
        ERROR_GEOGRAPHY_CREATE.set(bundle.getString("ERROR_GEOGRAPHY_CREATE"));
        ERROR_MARKUP_SAVE.set(bundle.getString("ERROR_MARKUP_SAVE"));
        ERROR_TEAM_SAVE.set(bundle.getString("ERROR_TEAM_SAVE"));
        ERROR_TEAM_PROFILE_SAVE.set(bundle.getString("ERROR_TEAM_PROFILE_SAVE"));
        ERROR_TEAM_CREATE.set(bundle.getString("ERROR_TEAM_CREATE"));
        ERROR_TEAM_ASSIGN.set(bundle.getString("ERROR_TEAM_ASSIGN"));
        ERROR_TEAM_ARCHIVE.set(bundle.getString("ERROR_TEAM_ARCHIVE"));
        ERROR_TEAMS_ARCHIVE.set(bundle.getString("ERROR_TEAMS_ARCHIVE"));
        ERROR_EXPORT_TEAM.set(bundle.getString("ERROR_EXPORT_TEAM"));
        ERROR_EXPORT_TEAMS.set(bundle.getString("ERROR_EXPORT_TEAMS"));
        ERROR_TEAM_PROFILE_REMOVE.set(bundle.getString("ERROR_TEAM_PROFILE_REMOVE"));
        ERROR_FETCH_CURRENCIES.set(bundle.getString("ERROR_FETCH_CURRENCIES"));
        ERROR_TEAM_UNARCHIVE.set(bundle.getString("ERROR_TEAM_UNARCHIVE"));
        ERROR_IMPORT_CURRENCIES.set(bundle.getString("ERROR_IMPORT_CURRENCIES"));
        ERROR_MISSING_CURRENCIES.set(bundle.getString("ERROR_MISSING_CURRENCIES"));
        SUCCESS_PROFILE_CREATED.set(bundle.getString("SUCCESS_PROFILE_CREATED"));
        SUCCESS_GEOGRAPHY_CREATED.set(bundle.getString("SUCCESS_GEOGRAPHY_CREATED"));
        SUCCESS_MULTIPLIERS_SAVED.set(bundle.getString("SUCCESS_MULTIPLIERS_SAVED"));
        SUCCESS_TEAM_SAVED.set(bundle.getString("SUCCESS_TEAM_SAVED"));
        SUCCESS_TEAM_PROFILE_SAVED.set(bundle.getString("SUCCESS_TEAM_PROFILE_SAVED"));
        SUCCESS_PROFILE_CHECKOUT.set(bundle.getString("SUCCESS_PROFILE_CHECKOUT"));
        SUCCESS_PROFILE_SAVED.set(bundle.getString("SUCCESS_PROFILE_SAVED"));
        SUCCESS_PROFILE_ARCHIVE.set(bundle.getString("SUCCESS_PROFILE_ARCHIVE"));
        SUCCESS_PROFILES_ARCHIVE.set(bundle.getString("SUCCESS_PROFILES_ARCHIVE"));
        SUCCESS_PROFILE_UNARCHIVE.set(bundle.getString("SUCCESS_PROFILE_UNARCHIVE"));
        SUCCESS_MARKUP_SAVED.set(bundle.getString("SUCCESS_MARKUP_SAVED"));
        SUCCESS_TEAM_CREATED.set(bundle.getString("SUCCESS_TEAM_CREATED"));
        SUCCESS_ASSIGNED_PROFILES.set(bundle.getString("SUCCESS_ASSIGNED_PROFILES"));
        SUCCESS_TEAM_PROFILE_REMOVE.set(bundle.getString("SUCCESS_TEAM_PROFILE_REMOVE"));
        SUCCESS_TEAM_ARCHIVE.set(bundle.getString("SUCCESS_TEAM_ARCHIVE"));
        SUCCESS_TEAM_UNARCHIVE.set(bundle.getString("SUCCESS_TEAM_UNARCHIVE"));
        SUCCESS_TEAMS_ARCHIVE.set(bundle.getString("SUCCESS_TEAMS_ARCHIVE"));
        SUCCESS_EXPORT_TEAM.set(bundle.getString("SUCCESS_EXPORT_TEAM"));
        SUCCESS_EXPORT_TEAMS.set(bundle.getString("SUCCESS_EXPORT_TEAMS"));
        SUCCESS_IMPORT_CURRENCIES.set(bundle.getString("SUCCESS_IMPORT_CURRENCIES"));
        REASON.set(bundle.getString("REASON"));
        REASON_TEAM_CREATED.set(bundle.getString("REASON_TEAM_CREATED"));
        REASON_ASSIGNED_PROFILE.set(bundle.getString("REASON_ASSIGNED_PROFILE"));
        REASON_REMOVED_PROFILE.set(bundle.getString("REASON_REMOVED_PROFILE"));
        REASON_UPDATED_PROFILE.set(bundle.getString("REASON_UPDATED_PROFILE"));
        LAST_EDIT.set(bundle.getString("LAST_EDIT"));
        REASON_UTILIZATION_CHANGE.set(bundle.getString("REASON_UTILIZATION_CHANGE"));
        UPDATED_AT.set(bundle.getString("UPDATED_AT"));
    }
}
