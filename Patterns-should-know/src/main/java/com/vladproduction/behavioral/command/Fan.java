package com.vladproduction.behavioral.command;

// one more receiver
public class Fan {

    public void start() {
        System.out.println("Fan is starting");
    }

    public void stop() {
        System.out.println("Fan is stopping");
    }

    public void increaseSpeed() {
        System.out.println("Increasing fan speed");
    }

}
