package org.kambanaria.knots.services;

import java.util.List;
import org.kambanaria.knots.microservices_models.Account;

public interface AccountService {

    List<Account> getAccountByUserId(int userId);

    Account getAccountById(int accountId);

    List<Account> getAccountsByUserIdBankId(int userId, int bankId);
}
