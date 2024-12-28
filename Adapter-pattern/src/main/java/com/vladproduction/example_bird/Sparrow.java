package com.vladproduction.example_bird;

public class Sparrow implements Bird {
    @Override
    public void fly() {
        System.out.println("Flying high in the sky!");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp chirp!");
    }
}
