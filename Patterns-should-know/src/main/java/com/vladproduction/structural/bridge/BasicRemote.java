package com.vladproduction.structural.bridge;

import java.rmi.Remote;

public class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }
}
