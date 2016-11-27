package org.kambanaria.knots.services;

import org.kambanaria.knots.microservices_models.Bank;

public interface BankService {

    Bank getBankById(int bankId);

}
