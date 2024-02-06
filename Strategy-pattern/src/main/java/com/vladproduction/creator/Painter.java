package com.vladproduction.creator;

public class Painter extends Creator {
    @Override
    public void createBook() {
        System.out.println("Brush paint the book");
    }
}