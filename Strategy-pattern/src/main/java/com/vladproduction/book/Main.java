package com.vladproduction.book;

public class Main {
    public static void main(String[] args) {

        DollarBook dollarBook = new DollarBook("Дж. Р. Р. Толкин", "Властелин колец: Братство кольца", 300, 34.99);


        EuroBook euroBook = new EuroBook("Джоан Роулинг", "Гарри Поттер и философский камень", 224, 24.99);


        dollarBook.printInfo();
        System.out.println("---------------------");
        euroBook.printInfo();
    }
}
