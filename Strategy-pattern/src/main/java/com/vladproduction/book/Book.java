package com.vladproduction.book;

public abstract class Book {
    protected String author;
    protected String title;
    protected int pages;
    protected double price;

    public Book(String author, String title, int pages, double price) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.price = price;
    }

    public abstract void printInfo();
}




