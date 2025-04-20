package com.vladproduction.creational.abstract_factory.crossplatform;

public class CrossPlatformUIDemo {
    public static void main(String[] args) {

        Application application = configureApplication();
        System.out.println("Application started with native UI components...");
        application.renderUI();

        System.out.println("\nTesting UI interactions:");
        application.testUI();

    }

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.contains("mac")) {
            factory = new MacOSFactory();
        }
        else {
            factory = new WindowsFactory();
        }

        app = new Application(factory);

        return app;
    }

}
