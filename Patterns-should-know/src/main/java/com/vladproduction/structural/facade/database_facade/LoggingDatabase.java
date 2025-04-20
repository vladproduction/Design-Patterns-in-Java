package com.vladproduction.structural.facade.database_facade;

public class LoggingDatabase {

    public void logAccess(int userId) {
        System.out.println("Logging access for user ID: " + userId);
    }

}
