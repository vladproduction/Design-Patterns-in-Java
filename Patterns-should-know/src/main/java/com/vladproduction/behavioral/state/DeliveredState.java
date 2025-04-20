package com.vladproduction.behavioral.state;

public class DeliveredState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new ShippedState());
    }

    @Override
    public String getStatus() {
        return "delivered";
    }
}
