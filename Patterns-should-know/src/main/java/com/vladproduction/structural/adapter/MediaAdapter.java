package com.vladproduction.structural.adapter;

// Adapter class that makes AdvancedMediaPlayer compatible with MediaPlayer
public class MediaAdapter implements MediaPlayer{

    private AdvanceMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vls")){
            advancedMediaPlayer = new VlsPlayer();
        } else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vls")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
