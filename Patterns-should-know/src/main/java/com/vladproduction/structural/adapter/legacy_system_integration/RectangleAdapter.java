package com.vladproduction.structural.adapter.legacy_system_integration;

// Adapter for the legacy rectangle to work with new system
public class RectangleAdapter implements Shape{

    private LegacyRectangle legacyRectangle;
    private double x, y, width, height;

    public RectangleAdapter(double x, double y, double width, double height) {
        this.legacyRectangle = new LegacyRectangle();
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        // Adapting from new coordinates system to old coordinates system
        legacyRectangle.display((int)x, (int)y, (int)(x + width), (int)(y + height));
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }

}
