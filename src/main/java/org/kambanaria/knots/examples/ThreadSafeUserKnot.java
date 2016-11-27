package org.kambanaria.knots.examples;

import org.kambanaria.knots.microservices_models.User;
import static org.kambanaria.knots.services.StaticRegistry.USER_SERVICE;

public class ThreadSafeUserKnot {
    // User MUST be immutable, reference MUST be volatile
    // userId MUST be final
    // Every service MUST have own lock

    private final int userId;
    private volatile User user;
    private final Object userLock = new Object();

    public ThreadSafeUserKnot(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public User getUser() {
        if (user == null) {
            synchronized (userLock) {
                if (user == null) {
                    this.user = USER_SERVICE.getUserById(userId);
                }
            }
        }
        return user;
    }
}
