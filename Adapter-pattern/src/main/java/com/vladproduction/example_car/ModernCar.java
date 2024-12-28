package com.vladproduction.example_car;

public class ModernCar implements Car{

    @Override
    public void drive() {
        System.out.println("Driving modern car");
    }

    @Override
    public void honk() {
        System.out.println("Modern car: electronic signal");
    }
}
