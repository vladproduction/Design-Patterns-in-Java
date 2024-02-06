package com.vladproduction.book;

public class EuroBook extends Book {

    public EuroBook(String author, String title, int pages, double price) {
        super(author, title, pages, price);
    }

    @Override
    public void printInfo() {
        System.out.println("Автор: " + author);
        System.out.println("Название: " + title);
        System.out.println("Количество страниц: " + pages);
        System.out.println("Цена: " + price + "eur (" + price + " евро)");
    }
}