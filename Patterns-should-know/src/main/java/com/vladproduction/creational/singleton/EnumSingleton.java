package com.vladproduction.creational.singleton;

public enum EnumSingleton {

    INSTANCE;

    public void doSomething() {
        System.out.println("EnumSingleton is doing something...");
    }
}
