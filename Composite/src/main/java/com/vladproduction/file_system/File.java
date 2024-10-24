package com.vladproduction.file_system;


/**
 * Leaf: A File class that implements the Component interface.
 * This class represents individual files, which cannot have children.
 * */
public class File implements FileSystemComponent{

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void display() {
        System.out.format("\nFile: %s (size = %s bytes)",name, size);
    }

    @Override
    public int getSize() {
        return size;
    }
}
