package com.vladproduction.structural.bridge;

// implementation interface
public interface Device {

    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChannel(int channel);

}
