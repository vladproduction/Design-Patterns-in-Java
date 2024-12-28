package com.vladproduction.example_db;

public class MySqlAdapter implements Database{

    private MySqlDatabase mySqlDatabase;

    public MySqlAdapter(MySqlDatabase mySqlDatabase) {
        this.mySqlDatabase = mySqlDatabase;
    }

    @Override
    public void connect() {
        mySqlDatabase.mySQLConnect();
    }

    @Override
    public void disconnect() {
        mySqlDatabase.mySQLDisconnect();
    }

    @Override
    public void executeQuery(String query) {
        mySqlDatabase.mySQLExecute(query);
    }
}
