package com.vladproduction.file_system;

public class MainApp {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File1.txt", 100);
        FileSystemComponent file2 = new File("File2.txt", 200);
        Directory directory = new Directory("MyDocuments");

        directory.addComponent(file1);
        directory.addComponent(file2);

        directory.display();
        System.out.println("Total size: " + directory.getSize() + " bytes");
    }
}
