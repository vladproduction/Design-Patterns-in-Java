package com.vladproduction.creational.singleton;

public class LazySingleton {

    // The single instance - lazily initialized
    private static LazySingleton instance;

    //private constructor
    private LazySingleton() {
        // Initialization code
    }

    //global access point with lazy initialization
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    //business methods
    public void doSomething() {
        System.out.println("LazySingleton is doing something...");
    }

}
