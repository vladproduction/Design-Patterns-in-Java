package com.vladproduction.creational.singleton;

public class Singleton {

    // The single instance - eagerly initialized
    private static final Singleton INSTANCE = new Singleton();

    // Private constructor prevents instantiation from other classes
    private Singleton() {
        // Initialization code
    }

    // Global access point
    public static Singleton getInstance() {
        return INSTANCE;
    }

    // Business methods
    public void doSomething() {
        System.out.println("Singleton is doing something...");
    }

}
