package com.example.max_market.service;

import com.example.max_market.model.User;

public interface UserService {

    void createUser(User user);
    boolean authUser(User user);
}
