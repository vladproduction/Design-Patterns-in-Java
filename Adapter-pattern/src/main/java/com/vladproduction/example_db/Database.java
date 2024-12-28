package com.vladproduction.example_db;

public interface Database {

    void connect();
    void disconnect();
    void executeQuery(String query);

}
