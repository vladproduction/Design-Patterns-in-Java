package vladproduction.bridge.demo;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class DemoExample {
    public static void main(String[] args) {
        try{
            //JDBC is an API
            DriverManager.registerDriver(new EmbeddedDriver()); // <- Driver

            String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

            Connection conn = DriverManager.getConnection(dbUrl);

            Statement sta = conn.createStatement();

            //This client is an abstraction and can work with any database that has a driver
            sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20),"
                    + " City VARCHAR(20))");

            System.out.println("Table created");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static class EmbeddedDriver implements Driver {
        @Override
        public Connection connect(String url, Properties info) throws SQLException {
            return null;
        }

        @Override
        public boolean acceptsURL(String url) throws SQLException {
            return false;
        }

        @Override
        public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
            return new DriverPropertyInfo[0];
        }

        @Override
        public int getMajorVersion() {
            return 0;
        }

        @Override
        public int getMinorVersion() {
            return 0;
        }

        @Override
        public boolean jdbcCompliant() {
            return false;
        }

        @Override
        public Logger getParentLogger() throws SQLFeatureNotSupportedException {
            return null;
        }
    }
}
