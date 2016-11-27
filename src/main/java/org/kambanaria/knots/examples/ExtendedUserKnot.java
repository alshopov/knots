package org.kambanaria.knots.examples;

import java.util.List;
import org.kambanaria.knots.microservices_models.Account;
import org.kambanaria.knots.microservices_models.User;
import static org.kambanaria.knots.services.StaticRegistry.*;

public class ExtendedUserKnot {

    private final int userId;
    private User user;
    private List<Account> accounts;

    public ExtendedUserKnot(int userId) {
        this.userId = userId;
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
            accounts = ACCOUNT_SERVICE.getAccountByUserId(userId);
        }
        return accounts;
    }
}
