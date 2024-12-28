package com.vladproduction.example_db;

public class MainApp {
    public static void main(String[] args) {
        MySqlDatabase mySqlDatabase = new MySqlDatabase();
        MySqlAdapter mySqlAdapter = new MySqlAdapter(mySqlDatabase);

        PostgresDatabase postgresDatabase = new PostgresDatabase();
        PostgresAdapter postgresAdapter = new PostgresAdapter(postgresDatabase);

        testDB(mySqlAdapter, "SELECT * FROM mysql");

        System.out.println("===");

        testDB(postgresAdapter, "SELECT * FROM postgres");
    }

    private static void testDB(Database database, String query) {
        database.connect();
        database.executeQuery(query);
        database.disconnect();
    }
}
