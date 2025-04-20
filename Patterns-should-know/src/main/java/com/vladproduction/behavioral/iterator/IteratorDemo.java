package com.vladproduction.behavioral.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();
        library.addBook(new Book("Design Patterns", "Gang of Four", "978-0201633610"));
        library.addBook(new Book("Clean Code", "Robert C. Martin", "978-0132350884"));
        library.addBook(new Book("Refactoring", "Martin Fowler", "978-0134757599"));

        // Create author catalog
        AuthorCatalog catalog = new AuthorCatalog(3);
        catalog.addBook(new Book("Effective Java", "Joshua Bloch", "978-0134685991"));
        catalog.addBook(new Book("Java Concurrency in Practice", "Brian Goetz", "978-0321349606"));
        catalog.addBook(new Book("Head First Design Patterns", "Eric Freeman", "978-0596007126"));

        // Use library iterator (front to back)
        System.out.println("Library Books (front to back):");
        BookIterator libraryIterator = library.createIterator();
        while (libraryIterator.hasNext()) {
            Book book = libraryIterator.next();
            System.out.println(" - " + book.getTitle() + " by " + book.getAuthor());
        }

        // Use catalog iterator (back to front)
        System.out.println("\nAuthor Catalog Books (back to front):");
        BookIterator catalogIterator = catalog.createIterator();
        while (catalogIterator.hasNext()) {
            Book book = catalogIterator.next();
            System.out.println(" - " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}
