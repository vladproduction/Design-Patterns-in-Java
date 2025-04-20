package com.vladproduction.structural.facade;

public class Memory {

    public void load(long position, String data) {
        System.out.println("Memory: Loading data at position " + position + " with data: " + data);
    }

}
