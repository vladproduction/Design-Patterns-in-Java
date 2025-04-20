package com.vladproduction.creational.singleton;

public class Main {
    public static void main(String[] args) {

        //Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();

        // Verify it's the same instance
        Singleton anotherReference = Singleton.getInstance();
        System.out.println("Same instance? " + (singleton == anotherReference));

        //LazySingleton
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.doSomething();

        //Thread-safe singleton
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        threadSafeSingleton.doSomething();

        // Try with enum singleton
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.doSomething();



    }
}
