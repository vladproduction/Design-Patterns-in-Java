package vladproduction.builder.carBuilder.builders;


import vladproduction.builder.carBuilder.cars.Car;
import vladproduction.builder.carBuilder.cars.CarType;
import vladproduction.builder.carBuilder.components.Engine;
import vladproduction.builder.carBuilder.components.GPSNavigator;
import vladproduction.builder.carBuilder.components.Transmission;
import vladproduction.builder.carBuilder.components.TripComputer;

//Concrete builders implement steps defined in the common interface
public class CarBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.type = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult(){
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
