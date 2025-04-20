package com.vladproduction.structural.adapter;

// Concrete Adapter implementations
public class VlsPlayer implements AdvanceMediaPlayer {

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing Vls file: " + fileName);
    }
}
