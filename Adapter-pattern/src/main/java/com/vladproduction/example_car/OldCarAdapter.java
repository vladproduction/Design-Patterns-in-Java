package com.vladproduction.example_car;

public class OldCarAdapter implements Car{

    private OldCar oldCar;

    public OldCarAdapter(OldCar oldCar) {
        this.oldCar = oldCar;
    }

    @Override
    public void drive() {
        oldCar.start();
        System.out.println("---> driving old car!!!");
    }

    @Override
    public void honk() {
        oldCar.beep();
    }
}
