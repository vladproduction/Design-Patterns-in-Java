package com.vladproduction.structural.adapter.legacy_system_integration;

// Drawing application using the Shape interface
public class DrawingApplication {

    public void drawShape(Shape shape) {
        shape.draw();
    }

    public void resizeShape(Shape shape, double factor) {
        System.out.println("Resizing shape by factor " + factor);
        shape.resize(factor);
        shape.draw();
    }

}
