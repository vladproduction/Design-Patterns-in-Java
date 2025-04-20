package com.vladproduction.behavioral.state;

public interface PackageState {

    void next(Package pkg);
    void prev(Package pkg);
    String getStatus();

}
