package com.vladproduction.creational.abstract_factory.crossplatform;

public class MacOSTextField implements TextField {

    @Override
    public void render() {
        System.out.println("Rendering a text field in MacOS style");
    }

    @Override
    public void handleInput() {
        System.out.println("Handling input in MacOS text field");
    }

}
