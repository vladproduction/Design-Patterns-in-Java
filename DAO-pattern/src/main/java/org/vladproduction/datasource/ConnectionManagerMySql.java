package org.vladproduction.datasource;

import org.vladproduction.configUtils.ConfigProperty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagerMySql implements ConnectionManager {

    public Connection getConnection() throws SQLException {
        String url = ConfigProperty.getConfigProperty("DB.url");
        String login = ConfigProperty.getConfigProperty("DB.login");
        String password = ConfigProperty.getConfigProperty("DB.password");
        return DriverManager.getConnection(url,login,password);
    }
}
