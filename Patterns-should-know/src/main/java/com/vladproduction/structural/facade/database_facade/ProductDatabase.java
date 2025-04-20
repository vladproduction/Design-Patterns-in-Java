package com.vladproduction.structural.facade.database_facade;

public class ProductDatabase {

    public void getConnection() {
        System.out.println("Connecting to Product database...");
    }

    public void loadProductHistory(int userId) {
        System.out.println("Loading product history for user ID: " + userId);
    }

    public void closeConnection() {
        System.out.println("Closing Product database connection...");
    }

}
