package com.vladproduction.creational.abstract_factory;

public class DarkCheckbox implements Checkbox{

    @Override
    public void render() {
        System.out.println("Rendering Dark Checkbox");
    }

    @Override
    public void onToggle() {
        System.out.println("Dark Checkbox toggled");
    }
}
