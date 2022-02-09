package com.sqltools;

import java.sql.*;

public class ConnDb {
    private  Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/my_db" +
            "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static String user = "root";
    private static String password = "xxxxxxxx";
    public Connection getConnect() {
        if (conn != null) {
            return conn;
        }
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public int executeUpdate(String sql) throws SQLException {
        int result = 0;
        stmt = conn.createStatement();
        result = stmt.executeUpdate(sql);
        return result;
    }

    public ResultSet executeQuery(String sql) throws SQLException {
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        return rs;
    }

}
