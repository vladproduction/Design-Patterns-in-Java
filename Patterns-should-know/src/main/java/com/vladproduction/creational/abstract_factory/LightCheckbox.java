package com.vladproduction.creational.abstract_factory;

public class LightCheckbox implements Checkbox{

    @Override
    public void render() {
        System.out.println("Rendering Light Checkbox");
    }

    @Override
    public void onToggle() {
        System.out.println("Light Checkbox toggled");
    }
}
