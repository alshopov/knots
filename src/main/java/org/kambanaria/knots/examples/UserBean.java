package org.kambanaria.knots.examples;

import org.kambanaria.knots.microservices_models.User;
// Almost a bean, no no-args contructor

public class UserBean {

    private final int userId;
    private final User user;

    public UserBean(int userId, User user) {
        this.userId = userId;
        this.user = user;
    }

    public int getUserId() {
        return userId;
    }

    public User getUser() {
        return user;
    }
}
