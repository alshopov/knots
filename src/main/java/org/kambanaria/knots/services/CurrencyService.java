package org.kambanaria.knots.services;

import org.kambanaria.knots.microservices_models.Currency;

public interface CurrencyService {

    Currency getCurrencyById(int currencyId);

}
