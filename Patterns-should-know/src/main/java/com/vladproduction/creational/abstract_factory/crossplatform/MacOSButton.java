package com.vladproduction.creational.abstract_factory.crossplatform;

// MacOS concrete products
public class MacOSButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering a button in MacOS style");
    }

    @Override
    public void handleClick() {
        System.out.println("MacOS button clicked");
    }

}

