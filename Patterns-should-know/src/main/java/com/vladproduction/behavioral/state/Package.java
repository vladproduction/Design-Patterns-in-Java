package com.vladproduction.behavioral.state;

public class Package {

    private PackageState state;
    private String id;

    public Package(String id) {
        this.id = id;
        // Initial state
        this.state = new OrderedState();
    }

    public String getId() {
        return id;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void previousState() {
        state.prev(this);
    }

    public String getStatus() {
        return "Package " + id + " is " + state.getStatus();
    }

}
