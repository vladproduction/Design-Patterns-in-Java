package com.vladproduction.creational.abstract_factory.crossplatform;

public interface GUIFactory {

    Button createButton();
    TextField createTextField();
    Dropdown createDropdown();

}
