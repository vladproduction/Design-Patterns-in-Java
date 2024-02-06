package org.vladproduction.datasource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManagerPostgres implements ConnectionManager {
    @Override
    public Connection getConnection() throws SQLException {
        //connection to Postgres DB
        return null;
    }
}
