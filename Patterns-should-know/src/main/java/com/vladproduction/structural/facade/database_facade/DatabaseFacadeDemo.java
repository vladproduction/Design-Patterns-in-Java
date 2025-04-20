package com.vladproduction.structural.facade.database_facade;

// Client code
public class DatabaseFacadeDemo {
    public static void main(String[] args) {

        DatabaseFacade dbFacade = new DatabaseFacade();
        
        // Client only needs to call one simple method
        dbFacade.getUserProfile(123);

    }
}