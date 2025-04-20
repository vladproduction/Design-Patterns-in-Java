package com.vladproduction.creational.abstract_factory;

public class DarkButton implements Button{

    @Override
    public void render() {
        System.out.println("Rendering Dark Button");
    }

    @Override
    public void onClick() {
        System.out.println("Clicking Dark Button");
    }
}
