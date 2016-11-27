package org.kambanaria.knots.services;

import org.kambanaria.knots.microservices_models.User;

public interface UserService {

    User getUserById(int userId);

}
