package com.vladproduction.creational.abstract_factory;

public class LightButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering Light Button");
    }

    @Override
    public void onClick() {
        System.out.println("Clicking Light Button");
    }
}
