package vladproduction.com.app03_car_factory.factories;

import vladproduction.com.app03_car_factory.Car;
import vladproduction.com.app03_car_factory.Sport;

public class SportFactory extends Factory {
    @Override
    public Car createCar() {
        return new Sport();
    }

}
