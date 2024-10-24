package ecostruxure.rate.calculator.gui.component.modals.addprofile;

import ecostruxure.rate.calculator.be.enums.CurrencyEnum;
import ecostruxure.rate.calculator.be.enums.ResourceType;
import ecostruxure.rate.calculator.gui.common.CurrencyItemModel;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AddProfileModel {
    private final ObservableList<AddProfileGeographyItemModel> locations = FXCollections.observableArrayList();
    private final ObservableList<CurrencyItemModel> currencies = FXCollections.observableArrayList();

    private final StringProperty name = new SimpleStringProperty("");
    private final ObjectProperty<AddProfileGeographyItemModel> selectedGeography = new SimpleObjectProperty<>();
    private final ObjectProperty<CurrencyItemModel> selectedCurrency = new SimpleObjectProperty<>();
    private final ObjectProperty<ResourceType> selectedResourceType = new SimpleObjectProperty<>(ResourceType.OVERHEAD);
    private final StringProperty hoursPerDay = new SimpleStringProperty("8");
    private final StringProperty annualSalary = new SimpleStringProperty("");
    private final StringProperty annualTotalHours = new SimpleStringProperty("0");
    private final StringProperty effectiveness = new SimpleStringProperty("");
    private final StringProperty effectiveWorkHours = new SimpleStringProperty("");

    private final ObjectProperty<CurrencyEnum> currency = new SimpleObjectProperty<>(CurrencyEnum.EUR);

    private final BooleanProperty nameIsValid  = new SimpleBooleanProperty(false);
    private final BooleanProperty selectedGeographyIsValid = new SimpleBooleanProperty(selectedGeography.get() != null);
    private final BooleanProperty selectedCurrencyIsValid = new SimpleBooleanProperty(selectedCurrency.get() != null);
    private final BooleanProperty hoursPerDayIsValid = new SimpleBooleanProperty(true);
    private final BooleanProperty annualSalaryIsValid = new SimpleBooleanProperty(false);
    private final BooleanProperty annualTotalHoursIsValid = new SimpleBooleanProperty(false);
    private final BooleanProperty effectivenessIsValid = new SimpleBooleanProperty(false);
    private final BooleanProperty okToAdd = new SimpleBooleanProperty(false);
    private final BooleanProperty effectiveWorkHoursIsValid = new SimpleBooleanProperty(false);

    public StringProperty nameProperty() {
        return name;
    }

    public ObservableList<AddProfileGeographyItemModel> locations() {
        return locations;
    }

    public ObservableList<CurrencyItemModel> currencies() {
        return currencies;
    }

    public ObjectProperty<AddProfileGeographyItemModel> selectedGeographyProperty() {
        return selectedGeography;
    }

    public ObjectProperty<CurrencyItemModel> selectedCurrencyProperty() {
        return selectedCurrency;
    }

    public ObjectProperty<ResourceType> selectedResourceTypeProperty() {
        return selectedResourceType;
    }

    public StringProperty hoursPerDayProperty() {
        return hoursPerDay;
    }

    public StringProperty annualSalaryProperty() {
        return annualSalary;
    }

    public StringProperty annualTotalHoursProperty() {
        return annualTotalHours;
    }

    public StringProperty effectivenessProperty() {
        return effectiveness;
    }

    public StringProperty effectiveWorkHoursProperty() {
        return effectiveWorkHours;
    }


    public ObjectProperty<CurrencyEnum> currencyProperty() {
        return currency;
    }

    public BooleanProperty nameIsValidProperty() {
        return nameIsValid;
    }

    public BooleanProperty selectedGeographyIsValidProperty() {
        return selectedGeographyIsValid;
    }

    public BooleanProperty selectedCurrencyIsValidProperty() {
        return selectedCurrencyIsValid;
    }

    public BooleanProperty hoursPerDayIsValidProperty() {
        return hoursPerDayIsValid;
    }

    public BooleanProperty annualSalaryIsValidProperty() {
        return annualSalaryIsValid;
    }

    public BooleanProperty annualTotalHoursIsValidProperty() {
        return annualTotalHoursIsValid;
    }

    public BooleanProperty effectivenessIsValidProperty() {
        return effectivenessIsValid;
    }

    public BooleanProperty effectiveWorkHoursIsValidProperty() {
        return effectiveWorkHoursIsValid;
    }


    public BooleanProperty okToAddProperty() {
        return okToAdd;
    }
}