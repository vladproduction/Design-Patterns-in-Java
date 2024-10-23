package vladproduction.com.app03_car_factory.factories;

import vladproduction.com.app03_car_factory.Car;
import vladproduction.com.app03_car_factory.SUV;

public class SUVFactory extends Factory {
    @Override
    public Car createCar() {
        return new SUV();
    }

}
