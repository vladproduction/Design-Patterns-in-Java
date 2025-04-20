package com.vladproduction.structural.bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {

        testDevice(new TV());
        System.out.println();
        testDevice(new Radio());

    }

    public static void testDevice(Device device) {
        System.out.println("Testing with basic remote:");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.togglePower();
        basicRemote.channelUp();
        basicRemote.volumeUp();
        basicRemote.togglePower();

        System.out.println("\nTesting with advanced remote:");
        AdvanceRemote advancedRemote = new AdvanceRemote(device);
        advancedRemote.togglePower();
        advancedRemote.goToChannel(100);
        advancedRemote.mute();
        advancedRemote.togglePower();
    }

}
