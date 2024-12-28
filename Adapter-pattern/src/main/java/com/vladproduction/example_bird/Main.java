package com.vladproduction.example_bird;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        ToyDuck toyDuck = new BirdAdapter(sparrow);

        // Now the toy duck can use the bird's behavior
        toyDuck.squeak(); // It will call the sparrow's makeSound method
    }
}
