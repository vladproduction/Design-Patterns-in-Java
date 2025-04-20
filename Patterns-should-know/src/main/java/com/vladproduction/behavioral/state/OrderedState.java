package com.vladproduction.behavioral.state;

public class OrderedState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState(new ShippedState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("Package is in its initial state.");
    }

    @Override
    public String getStatus() {
        return "ordered";
    }
}
