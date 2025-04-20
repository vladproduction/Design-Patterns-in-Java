package com.vladproduction.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Library implements BookCollection {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public BookIterator createIterator() {
        return new LibraryIterator(books);
    }

    // Concrete Iterator
    private class LibraryIterator implements BookIterator {
        private List<Book> books;
        private int position = 0;

        public LibraryIterator(List<Book> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public Book next() {
            if (this.hasNext()) {
                return books.get(position++);
            }
            return null;
        }
    }

}
