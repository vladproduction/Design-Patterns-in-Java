package com.vladproduction.structural.facade.database_facade;

// Complex subsystem classes
public class UserDatabase {

    public void getConnection() {
        System.out.println("Connecting to User database...");
    }

    public void loadUserData(int userId) {
        System.out.println("Loading user data for ID: " + userId);
    }

    public void closeConnection() {
        System.out.println("Closing User database connection...");
    }

}
