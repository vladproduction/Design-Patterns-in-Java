package com.vladproduction.creational.abstract_factory.crossplatform;

// Windows concrete products

class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering a button in Windows style");
    }

    @Override
    public void handleClick() {
        System.out.println("Windows button clicked");
    }

}

