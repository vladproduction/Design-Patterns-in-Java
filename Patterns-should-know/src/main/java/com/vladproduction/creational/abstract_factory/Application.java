package com.vladproduction.creational.abstract_factory;

public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }

    public void userInteraction() {
        button.onClick();
        checkbox.onToggle();
    }

}
