package com.vladproduction.app08;

public class MainSingletonE {
    public static void main(String[] args) {

        // Get the unique instance of SingletonE
        SingletonE singleton1 = SingletonE.getInstance();
        SingletonE singleton2 = SingletonE.getInstance();

        // Check if both instances are the same
        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same:");
            System.out.println("SingletonE singleton1 = : " + singleton1);//com.vladproduction.app08.SingletonE@3feba861
            System.out.println("SingletonE singleton2 = : " + singleton2);//com.vladproduction.app08.SingletonE@3feba861

        } else {
            System.out.println("Instances are different.");
        }

    }
}
