package com.vladproduction.structural.bridge;

public class AdvanceRemote extends RemoteControl {

    public AdvanceRemote(Device device) {
        super(device);
    }

    public void mute(){
        device.setVolume(0);
        System.out.println("Mute");
    }

    public void goToChannel(int channel){
        device.setChannel(channel);
    }

}
