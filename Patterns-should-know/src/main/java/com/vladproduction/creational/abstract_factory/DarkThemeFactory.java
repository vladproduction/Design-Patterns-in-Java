package com.vladproduction.creational.abstract_factory;

public class DarkThemeFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
