package com.vladproduction.creational.abstract_factory;

public class LightThemeFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
