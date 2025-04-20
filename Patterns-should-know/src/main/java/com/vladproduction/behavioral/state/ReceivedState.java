package com.vladproduction.behavioral.state;

public class ReceivedState implements PackageState {
    @Override
    public void next(Package pkg) {
        System.out.println("Package is in its final state.");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public String getStatus() {
        return "received";
    }
}
