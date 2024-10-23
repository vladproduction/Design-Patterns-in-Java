package com.vladproduction.app08;

public class MainSingletonE2 {
    public static void main(String[] args) {
        // Initialize the singleton instance with a name
        SingletonE2 singleton1 = SingletonE2.getInstance("MySingleton");
        System.out.println("Instance Name: " + singleton1.getName());

        // Retrieve the instance again to demonstrate it remains the same
        SingletonE2 singleton2 = SingletonE2.getInstance("AnotherName"); // This won't change the name
        System.out.println("Instance Name: " + singleton2.getName());

        //as expected:
        /*  Instance Name: MySingleton
            Instance Name: MySingleton*/

        // Check if both instances are the same
        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same: " + singleton1);
        } else {
            System.out.println("Instances are different.");
        }
    }
}
