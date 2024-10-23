package com.vladproduction.app08;

public class SingletonE2 {

    private String name;
    private SingletonE2(String name){
        this.name = name;
    }

    private static class LazyHolder{
        static SingletonE2 instance;
    }
    public static SingletonE2 getInstance(String name){
        if (LazyHolder.instance == null){
            LazyHolder.instance = new SingletonE2(name);
        }
        return LazyHolder.instance;
    }

    public String getName() {
        return name;
    }
}
