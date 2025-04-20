package com.vladproduction.behavioral.iterator;

public class AuthorCatalog implements BookCollection {

    private Book[] books;
    private int numberOfBooks;

    public AuthorCatalog(int size) {
        books = new Book[size];
        numberOfBooks = 0;
    }

    public void addBook(Book book) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks++] = book;
        } else {
            System.out.println("Catalog is full");
        }
    }

    @Override
    public BookIterator createIterator() {
        return new AuthorIterator();
    }

    // Concrete Iterator that iterates in reverse order
    private class AuthorIterator implements BookIterator {
        private int position;

        public AuthorIterator() {
            position = numberOfBooks - 1;
        }

        @Override
        public boolean hasNext() {
            return position >= 0;
        }

        @Override
        public Book next() {
            if (this.hasNext()) {
                return books[position--];
            }
            return null;
        }
    }
}
