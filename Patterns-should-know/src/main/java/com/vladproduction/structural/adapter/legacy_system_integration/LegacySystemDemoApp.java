package com.vladproduction.structural.adapter.legacy_system_integration;

public class LegacySystemDemoApp {
    public static void main(String[] args) {

        DrawingApplication app = new DrawingApplication();

        // Using the modern system with Circle
        Shape circle = new Circle(10, 10, 5);
        System.out.println("Working with Circle:");
        app.drawShape(circle);
        app.resizeShape(circle, 2);

        System.out.println("\nWorking with legacy Rectangle via Adapter:");
        // Using the legacy system with adapter
        Shape rectangle = new RectangleAdapter(20, 20, 10, 5);
        app.drawShape(rectangle);
        app.resizeShape(rectangle, 1.5);

    }
}
