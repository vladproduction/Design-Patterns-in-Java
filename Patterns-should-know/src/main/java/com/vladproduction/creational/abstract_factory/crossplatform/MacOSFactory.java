package com.vladproduction.creational.abstract_factory.crossplatform;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public TextField createTextField() {
        return new MacOSTextField();
    }

    @Override
    public Dropdown createDropdown() {
        return new WindowsDropdown();
    }
}
