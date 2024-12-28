package com.vladproduction.example_db;

public class MySqlDatabase {

    public void mySQLConnect() {
        System.out.println("Connected to MySQL Database.");
    }

    public void mySQLDisconnect() {
        System.out.println("Disconnected from MySQL Database.");
    }

    public void mySQLExecute(String query) {
        System.out.println("Executing MySQL query: " + query);
    }

}
