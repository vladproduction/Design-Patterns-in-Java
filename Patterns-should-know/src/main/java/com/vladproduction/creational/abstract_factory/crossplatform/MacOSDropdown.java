package com.vladproduction.creational.abstract_factory.crossplatform;

public class MacOSDropdown implements Dropdown {

    @Override
    public void render() {
        System.out.println("Rendering a dropdown in MacOS style");
    }

    @Override
    public void select(int index) {
        System.out.println("Selected item " + index + " in MacOS dropdown");
    }

}
