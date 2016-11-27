package org.kambanaria.knots.services;

import org.kambanaria.knots.microservices_models.Country;

public interface CountryService {

    Country getCountryById(int countryId);

}
