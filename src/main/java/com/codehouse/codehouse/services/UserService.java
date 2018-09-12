package com.codehouse.codehouse.services;

import com.codehouse.codehouse.models.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
