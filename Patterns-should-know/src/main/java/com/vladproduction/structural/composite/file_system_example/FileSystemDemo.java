package com.vladproduction.structural.composite.file_system_example;

public class FileSystemDemo {
    public static void main(String[] args) {
        // Create file system structure
        Directory root = new Directory("root");

        Directory home = new Directory("home");
        Directory user1 = new Directory("user1");
        Directory user2 = new Directory("user2");

        File file1 = new File("file1.txt", 1000);
        File file2 = new File("file2.txt", 2000);
        File file3 = new File("file3.jpg", 5000);
        File file4 = new File("file4.doc", 3000);

        // Build the structure
        root.addComponent(home);

        home.addComponent(user1);
        home.addComponent(user2);

        user1.addComponent(file1);
        user1.addComponent(file2);

        user2.addComponent(file3);
        user2.addComponent(file4);

        // Print the file system
        System.out.println("File System Structure:");
        root.print("");

        // Get size of specific components
        System.out.println("\nSize of user1: " + user1.getSize() + " bytes");
        System.out.println("Size of user2: " + user2.getSize() + " bytes");
        System.out.println("Size of home: " + home.getSize() + " bytes");
        System.out.println("Size of entire file system: " + root.getSize() + " bytes");
    }
}
