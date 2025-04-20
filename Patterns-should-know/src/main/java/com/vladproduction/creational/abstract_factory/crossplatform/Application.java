package com.vladproduction.creational.abstract_factory.crossplatform;

public class Application {

    private final Button button;
    private final TextField textField;
    private final Dropdown dropdown;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.textField = factory.createTextField();
        this.dropdown = factory.createDropdown();
    }

    public void renderUI(){
        button.render();
        textField.render();
        dropdown.render();
    }

    public void testUI(){
        button.handleClick();
        textField.handleInput();
        dropdown.select(2);
    }
}
