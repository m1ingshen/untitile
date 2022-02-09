package com.service;

import com.dao.IUserDao;
import com.dao.UserDaoImpl;
import com.model.User;

public class UserServiceImpl implements IUserService{
    private IUserDao iud = new UserDaoImpl();
    @Override
    public void registerUser(User user) {
        iud.add(user);
    }

    @Override
    public User loginUser(String username, String psw) {
        return iud.find(username, psw);
    }
}
