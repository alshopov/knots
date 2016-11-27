package org.kambanaria.knots.examples;

import java.util.List;
import org.kambanaria.knots.microservices_models.Account;
import org.kambanaria.knots.microservices_models.Bank;
import org.kambanaria.knots.microservices_models.User;
import static org.kambanaria.knots.services.StaticRegistry.*;

public class DoubleUserKnot {

    private final int userId;
    private final int bankId;
    private User user;
    private Bank bank;
    private List<Account> accounts;

    public DoubleUserKnot(int userId, int bankId) {
        this.userId = userId;
        this.bankId = bankId;
    }

    public int getUserId() {
        return userId;
    }

    public User getUser() {
        if (user == null) {
            user = USER_SERVICE.getUserById(userId);
        }
        return user;
    }

    public List<Account> getAccounts() {
        if (accounts == null) {
            accounts = ACCOUNT_SERVICE.getAccountsByUserIdBankId(userId, bankId);
        }
        return accounts;
    }

    public Bank getBank() {
        if (bank == null) {
            bank = BANK_SERVICE.getBankById(bankId);
        }
        return bank;
    }
}
