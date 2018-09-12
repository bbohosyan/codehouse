package com.codehouse.codehouse.services;

import com.codehouse.codehouse.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
