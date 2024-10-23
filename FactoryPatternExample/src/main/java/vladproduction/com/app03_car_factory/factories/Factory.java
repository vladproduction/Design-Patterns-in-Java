package vladproduction.com.app03_car_factory.factories;

import vladproduction.com.app03_car_factory.Car;

public abstract class Factory {

    public abstract Car createCar();

    public Car assembleCar(){
        Car car = createCar();
        System.out.println("Assembling: " + car.getClass().getSimpleName());
        car.assemble();
        System.out.println("Car completed!");
        return car;
    }

}
