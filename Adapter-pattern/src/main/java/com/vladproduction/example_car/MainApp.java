package com.vladproduction.example_car;

public class MainApp {
    public static void main(String[] args) {

        Car modernCar = new ModernCar();
        testCar(modernCar);
        System.out.println("---");

        OldCar oldCar = new OldCar();
        Car oldCarAdapter = new OldCarAdapter(oldCar);
        testCar(oldCarAdapter);

    }

    private static void testCar(Car car) {

        car.drive();
        car.honk();

    }
}
