package com.vladproduction.structural.proxy.protection_proxy_example;

public class RealDocument implements Document {

    private final String name;

    public RealDocument(String name) {
        this.name = name;
        System.out.println("Document created: " + name);
    }

    @Override
    public void view() {
        System.out.println("Viewing document: " + name);
    }

    @Override
    public void edit() {
        System.out.println("Editing document: " + name);
    }

}
