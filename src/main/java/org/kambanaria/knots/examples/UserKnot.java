package org.kambanaria.knots.examples;

import org.kambanaria.knots.microservices_models.User;
import static org.kambanaria.knots.services.StaticRegistry.USER_SERVICE;

public class UserKnot {

    private final int userId;
    private User user;

    public UserKnot(int userId) {
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
}
