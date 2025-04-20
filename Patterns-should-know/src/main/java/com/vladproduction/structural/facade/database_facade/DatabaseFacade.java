package com.vladproduction.structural.facade.database_facade;

// Facade
public class DatabaseFacade {

    private final UserDatabase userDb;
    private final ProductDatabase productDb;
    private final LoggingDatabase logDb;

    public DatabaseFacade() {
        this.userDb = new UserDatabase();
        this.productDb = new ProductDatabase();
        this.logDb = new LoggingDatabase();
    }

    public void getUserProfile(int userId) {
        try {
            // Connect to databases
            userDb.getConnection();
            productDb.getConnection();

            // Load all required data
            userDb.loadUserData(userId);
            productDb.loadProductHistory(userId);

            // Log the access
            logDb.logAccess(userId);
        } finally {
            // Close connections
            userDb.closeConnection();
            productDb.closeConnection();
        }
    }
}
