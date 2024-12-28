package com.vladproduction.sharingappimproved;

import com.vladproduction.sharingappimproved.exceptions.CameraException;

import java.util.HashMap;
import java.util.Map;

public class BasicCameraApp extends PhoneCameraApp{

    //for errorCase() in MainApp:
//    @Override
//    protected void takePhoto() throws CameraException {
//        System.out.println("Taking basic photo");
//        currentPhoto = new Photo(new byte[100], new HashMap<>(), "JPG");
//    }
//
//    @Override
//    protected void savePhoto() throws CameraException {
//        System.out.println("Saving basic photo");
//    }

    //for noErrorCase() in MainApp:
    @Override
    protected void takePhoto() throws CameraException {
        System.out.println("Taking basic photo");

        // Include required metadata for sharing
        Map<String, String> metadata = new HashMap<>();
        metadata.put("recipient", "user@example.com");  // Set default recipient

        currentPhoto = new Photo(
                new byte[100],
                metadata,
                "JPG"
        );
    }

    @Override
    protected void savePhoto() throws CameraException {
        System.out.println("Saving basic photo");
    }

}
