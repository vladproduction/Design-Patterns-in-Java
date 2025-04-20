package com.vladproduction.creational.abstract_factory.crossplatform;

public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }

    @Override
    public Dropdown createDropdown() {
        return new WindowsDropdown();
    }
}
