package com.vladproduction.creational.singleton;

public class ThreadSafeSingleton {

    // Volatile ensures visibility across threads
    private static volatile ThreadSafeSingleton instance;

    // Private constructor
    private ThreadSafeSingleton() {
        // Initialization code
    }

    //doubly-checked locking for thread-safe and efficiency
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    //business methods
    public void doSomething() {
        System.out.println("ThreadSafeSingleton is doing something...");
    }

}
