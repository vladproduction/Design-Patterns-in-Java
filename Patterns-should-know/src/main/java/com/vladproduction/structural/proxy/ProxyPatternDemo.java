package com.vladproduction.structural.proxy;

// Client code
public class ProxyPatternDemo {
    public static void main(String[] args) {

        // Create a proxy
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // The image will be loaded from disk only when display() is called
        System.out.println("Image will be loaded on first display call");

        // Load and display image1
        System.out.println("\nDisplaying image1:");
        image1.display();  // Loading happens here for the first time

        // Display image1 again - no loading needed
        System.out.println("\nDisplaying image1 again:");
        image1.display();  // Already loaded, so no loading occurs

        // Load and display image2
        System.out.println("\nDisplaying image2:");
        image2.display();  // Loading happens here for the first time

    }
}
