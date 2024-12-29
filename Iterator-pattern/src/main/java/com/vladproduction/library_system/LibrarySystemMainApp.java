package com.vladproduction.library_system;

import java.util.Iterator;

public class LibrarySystemMainApp {
    public static void main(String[] args) {

        Library library = new Library();

        // Create Authors and their Magazine
        Author author1 = new Author("George Orwell");
        author1.addMagazine(new Magazine("1984"));
        author1.addMagazine(new Magazine("Animal Farm"));

        Author author2 = new Author("Harper Lee");
        author2.addMagazine(new Magazine("To Kill a Mockingbird"));

        Author author3 = new Author("F. Scott Fitzgerald");
        author3.addMagazine(new Magazine("The Great Gatsby"));
        author3.addMagazine(new Magazine("This Side of Paradise"));

        // Add authors to the library
        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addAuthor(author3);

        // Iterate through authors and their books
        for (Author author : library) {
            System.out.println("Author: " + author.getName());
            Iterator<Magazine> magazineIterator = author.magazineIterator();
            while (magazineIterator.hasNext()) {
                Magazine magazine = magazineIterator.next();
                System.out.println("  Magazine: " + magazine.getTitle());
            }
        }

    }
}
