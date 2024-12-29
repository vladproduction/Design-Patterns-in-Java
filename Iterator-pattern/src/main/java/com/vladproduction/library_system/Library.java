package com.vladproduction.library_system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Library class implementing Iterable
 * */
public class Library implements Iterable<Author> {

    private List<Author> authors;

    public Library() {
        authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    @Override
    public Iterator<Author> iterator(){
        return new LibraryIterator();
    }

    private class LibraryIterator implements Iterator<Author>{

        private int currentIndex;

        public LibraryIterator() {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < authors.size();
        }

        @Override
        public Author next() {
            if(hasNext()){
                return authors.get(currentIndex++);
            }
            throw new IndexOutOfBoundsException("No more authors in library");
        }
    }

}











