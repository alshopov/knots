package org.kambanaria.knots.examples;

import org.kambanaria.knots.microservices_models.Country;
import org.kambanaria.knots.microservices_models.Currency;
import static org.kambanaria.knots.services.StaticRegistry.*;

public class CountryKnot {

    private final int countryId;
    private Country country;
    private Currency currency;

    public CountryKnot(int countryId) {
        this.countryId = countryId;
    }

    public int getCountryId() {
        return countryId;
    }

    public Country getCountry() {
        if (country == null) {
            country = COUNTRY_SERVICE.getCountryById(countryId);
        }
        return country;
    }

    public Currency getCurrency() {
        if (currency == null) {
            currency = CURRENCY_SERVICE.getCurrencyById(getCountry().getCurrencyId());
        }
        return currency;
    }
}
