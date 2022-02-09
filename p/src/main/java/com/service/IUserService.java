package com.service;

import com.model.User;

public interface IUserService {
    void registerUser(User user);
    User loginUser(String username, String psw);
}
