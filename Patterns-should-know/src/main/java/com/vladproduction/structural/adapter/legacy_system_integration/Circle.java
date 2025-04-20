package com.vladproduction.structural.adapter.legacy_system_integration;

// Modern implementation
public class Circle implements Shape{

    private double x, y, radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle at [" + x + "," + y + "], radius " + radius);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }

}
