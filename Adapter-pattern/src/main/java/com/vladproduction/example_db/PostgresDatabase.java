package com.vladproduction.example_db;

public class PostgresDatabase {

    public void mySQLConnect() {
        System.out.println("Connected to Postgres Database.");
    }

    public void mySQLDisconnect() {
        System.out.println("Disconnected from Postgres Database.");
    }

    public void mySQLExecute(String query) {
        System.out.println("Executing Postgres query: " + query);
    }

}
