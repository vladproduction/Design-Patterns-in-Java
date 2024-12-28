package com.vladproduction.example_bird;

public class BirdAdapter implements ToyDuck{

    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound(); // Adapting the bird's sound to the toy duck's method
    }
}
