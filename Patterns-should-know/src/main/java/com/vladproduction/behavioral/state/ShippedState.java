package com.vladproduction.behavioral.state;

public class ShippedState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public String getStatus() {
        return "shipped";
    }
}
