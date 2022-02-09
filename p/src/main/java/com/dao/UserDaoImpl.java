package com.dao;

import com.model.User;
import com.sqltools.ConnDb;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements IUserDao{
    ConnDb conn = new ConnDb();

    @Override
    public User find(String username, String psw) {
        String sql = "select * from usertable where username = '" +
                username +
                "' and password = '" +
                psw +
                "'";
        try {
            ResultSet rs = conn.executeQuery(sql);
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setTelephone(rs.getString("telephone"));
            user.setEmail(rs.getString("email"));
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User find(String username) {
        return null;
    }

    @Override
    public void add(User user) {
        String sql = "insert into usertable" +
                "(id, username, password, telephone, email) " +
                "values " +
                "(" +
                user.getId() +
                ", '" +
                user.getUsername() +
                "', '" +
                user.getPassword() +
                "', '" +
                user.getTelephone() +
                "', '" +
                user.getEmail() +
                "')";
        try {
            conn.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
