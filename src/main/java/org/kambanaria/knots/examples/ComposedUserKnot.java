package org.kambanaria.knots.examples;

import org.kambanaria.knots.microservices_models.Country;
import org.kambanaria.knots.microservices_models.Currency;
import org.kambanaria.knots.microservices_models.User;
import static org.kambanaria.knots.services.StaticRegistry.*;

public class ComposedUserKnot {

    private final int userId;
    private User user;
    private CountryKnot countryKnot;

    public ComposedUserKnot(int userId) {
        this.userId = userId;
    }

    public User getUser() {
        if (user == null) {
            user = USER_SERVICE.getUserById(userId);
        }
        return user;
    }

    private CountryKnot getCountryKnot() {
        if (countryKnot == null) {
            countryKnot = new CountryKnot(getUser().getCountryId());
        }
        return countryKnot;
    }

    public Country getCountry() {
        return getCountryKnot().getCountry();
    }

    public Currency getCurrency() {
        return getCountryKnot().getCurrency();
    }
}
