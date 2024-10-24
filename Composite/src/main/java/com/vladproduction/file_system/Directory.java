package com.vladproduction.file_system;


import java.util.ArrayList;
import java.util.List;

/**
 * Composite: A Directory class that also implements the Component interface.
 * This class can contain both files and other directories.
 * */
public class Directory implements FileSystemComponent{

    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent fileSystemComponent){
        components.add(fileSystemComponent);
    }

    @Override
    public void display() {
        System.out.format("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.display();
        }
        System.out.println();
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}
