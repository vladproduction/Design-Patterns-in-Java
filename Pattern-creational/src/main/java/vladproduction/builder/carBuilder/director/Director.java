package vladproduction.builder.carBuilder.director;


import vladproduction.builder.carBuilder.builders.Builder;
import vladproduction.builder.carBuilder.cars.CarType;
import vladproduction.builder.carBuilder.components.Engine;
import vladproduction.builder.carBuilder.components.GPSNavigator;
import vladproduction.builder.carBuilder.components.Transmission;
import vladproduction.builder.carBuilder.components.TripComputer;

/*
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore, it may not know what product is
 * being built.
 */
public class Director {

    public void constructSportCar(Builder builder){
        builder.setCarType(CarType.SPORT_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0.0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(5);
        builder.setEngine(new Engine(2.0, 0.0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUVCar(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setSeats(7);
        builder.setEngine(new Engine(2.5, 0.0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
}
