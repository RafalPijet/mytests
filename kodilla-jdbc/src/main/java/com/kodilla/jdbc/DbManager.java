package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private Connection connection;
    private static DbManager dbManagerInstance;

    private DbManager() throws SQLException {
        Properties properties = new Properties();
        properties.put("user", "kodilla_user");
        properties.put("password", "kodilla_password");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodilla_cource?serverTimezone=Europe/Warsaw&useSSL=False", properties);
    }

    public static DbManager getInstance() throws SQLException{
        if (dbManagerInstance == null) {
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }

    public Connection getConnection() {
        return connection;
    }
}
