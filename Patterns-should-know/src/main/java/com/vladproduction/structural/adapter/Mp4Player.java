package com.vladproduction.structural.adapter;

// Concrete Adapter implementations
public class Mp4Player implements AdvanceMediaPlayer {

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }

    @Override
    public void playVlc(String fileName) {
        // do nothing
    }
}
