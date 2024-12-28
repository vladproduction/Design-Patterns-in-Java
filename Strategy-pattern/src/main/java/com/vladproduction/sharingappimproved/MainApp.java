package com.vladproduction.sharingappimproved;

import com.vladproduction.sharingappimproved.exceptions.CameraException;
import com.vladproduction.sharingappimproved.implshare.EmailShare;
import com.vladproduction.sharingappimproved.implshare.SocialShare;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        errorCase();
//        noErrorCase();
    }

    private static void errorCase() {
        try {
            // Basic camera example
            PhoneCameraApp basicApp = new BasicCameraApp();
            basicApp.setShareStrategy(new EmailShare());

            Map<String, String> emailMetadata = new HashMap<>();
            emailMetadata.put("recipient", "user@example.com");
            basicApp.processPhoto();

            // Professional camera example
            PhoneCameraApp proApp = new ProfessionalCameraApp();
            proApp.setShareStrategy(new SocialShare());

            Map<String, String> socialMetadata = new HashMap<>();
            socialMetadata.put("platform", "Instagram");
            proApp.processPhoto();

        } catch (CameraException e) {
            System.err.println("Camera error: " + e.getMessage());
        }
    }

    private static void noErrorCase() {

        try {
            // Basic camera example
            BasicCameraApp basicApp = new BasicCameraApp();

            // Create email share strategy
            EmailShare emailShare = new EmailShare();
            basicApp.setShareStrategy(emailShare);

            // Set up the photo metadata with required email recipient
            Map<String, String> metadata = new HashMap<>();
            metadata.put("recipient", "user@example.com");

            // Create photo with metadata
            Photo photo = new Photo(
                    new byte[100],
                    metadata,
                    "JPG"
            );

            basicApp.processPhoto();

        } catch (CameraException e) {
            System.err.println("Camera error: " + e.getMessage());
        }

    }

}
