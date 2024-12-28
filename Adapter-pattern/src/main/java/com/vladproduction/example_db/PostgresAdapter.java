package com.vladproduction.example_db;

public class PostgresAdapter implements Database{

    private PostgresDatabase postgresDatabase;

    public PostgresAdapter(PostgresDatabase postgresDatabase) {
        this.postgresDatabase = postgresDatabase;
    }

    @Override
    public void connect() {
        postgresDatabase.mySQLConnect();
    }

    @Override
    public void disconnect() {
        postgresDatabase.mySQLDisconnect();
    }

    @Override
    public void executeQuery(String query) {
        postgresDatabase.mySQLExecute(query);
    }
}
