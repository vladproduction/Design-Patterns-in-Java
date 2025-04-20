package com.vladproduction.creational.abstract_factory.crossplatform;

public class WindowsDropdown implements Dropdown {

    @Override
    public void render() {
        System.out.println("Rendering a dropdown in Windows style");
    }

    @Override
    public void select(int index) {
        System.out.println("Selected item " + index + " in Windows dropdown");
    }

}
