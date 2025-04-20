package com.vladproduction.creational.abstract_factory;

public class MainApp {
    public static void main(String[] args) {

        //create Application with light theme
        GUIFactory lightFactory = new LightThemeFactory();
        Application lightApplication = new Application(lightFactory);
        System.out.println("Light Theme UI:");
        lightApplication.render();
        lightApplication.userInteraction();

        System.out.println("\n-----------------\n");

        //create Application with light theme
        GUIFactory darkFactory = new DarkThemeFactory();
        Application darkApplication = new Application(darkFactory);
        System.out.println("Dark Theme UI:");
        darkApplication.render();
        darkApplication.userInteraction();




    }
}
