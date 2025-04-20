package com.vladproduction.behavioral.command;

// Receiver
public class Light {

    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void turnOn(){
        System.out.println("Light is turned on at " + location);
    }

    public void turnOff(){
        System.out.println("Light is turned off at " + location);
    }
}
