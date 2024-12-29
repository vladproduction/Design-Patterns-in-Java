package com.vladproduction.book_collection;

/**
 * Main class to demonstrate the Iterator pattern
 * */
public class MainIteratorPatternApp {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("The Great Gatsby"));
        bookCollection.addBook(new Book("1984"));
        bookCollection.addBook(new Book("To Kill a Mockingbird"));
        //use iterator to traverse book collection:
        for (Book book : bookCollection) {
            System.out.println("Book: " + book.getTitle());
        }
    }
}
