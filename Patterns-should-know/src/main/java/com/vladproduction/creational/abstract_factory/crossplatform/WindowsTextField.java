package com.vladproduction.creational.abstract_factory.crossplatform;

public class WindowsTextField implements TextField {

    @Override
    public void render() {
        System.out.println("Rendering a text field in Windows style");
    }

    @Override
    public void handleInput() {
        System.out.println("Handling input in Windows text field");
    }

}
