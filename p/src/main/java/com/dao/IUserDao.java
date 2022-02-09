package com.dao;

import com.model.User;

public interface IUserDao {
    User find(String username, String psw);
    User find(String username);
    void add(User user);

}
