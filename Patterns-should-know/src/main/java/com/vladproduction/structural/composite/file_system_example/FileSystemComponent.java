package com.vladproduction.structural.composite.file_system_example;

public interface FileSystemComponent {

    String getName();
    long getSize();
    void print(String indent);

}
