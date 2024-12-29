package com.vladproduction.book_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Custom Aggregate class with an inner Iterator class
 * */
public class BookCollection implements Iterable<Book> {

    private List<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    //method to return Iterator:
    public Iterator<Book> iterator(){
        return new BookIterator();
    }

    private class BookIterator implements Iterator<Book>{
        private int index;

        public BookIterator() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public Book next() {
            if(hasNext()){
                return books.get(index++);
            }
            throw new IndexOutOfBoundsException("No more books in Collection");
        }
    }
}









