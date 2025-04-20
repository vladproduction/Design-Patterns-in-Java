package com.vladproduction.structural.adapter;

// Client class that uses the Target interface
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //native support for mp3
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3: "+fileName);
        }
        //support other formats via adapter
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media type: " + audioType + " format not supported");
        }
    }
}
