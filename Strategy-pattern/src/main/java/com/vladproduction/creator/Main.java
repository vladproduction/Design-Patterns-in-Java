package com.vladproduction.creator;

public class Main {
    public static void main(String[] args) {

        Creator creator = new Writer();


        creator.createBook();


        creator = new Painter();


        creator.createBook();
    }
}
