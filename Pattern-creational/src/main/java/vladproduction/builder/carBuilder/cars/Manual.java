package vladproduction.builder.carBuilder.cars;


import vladproduction.builder.carBuilder.components.Engine;
import vladproduction.builder.carBuilder.components.GPSNavigator;
import vladproduction.builder.carBuilder.components.Transmission;
import vladproduction.builder.carBuilder.components.TripComputer;

//Car manual is another product. Note that it does not have the same ancestor
// * as a Car. They are not related.
public class Manual {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
                  GPSNavigator gpsNavigator) {
        this.carType = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print(){
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Amount of seats: " + seats + "\n";
        info += "Engine: -volume = " + engine.getVolume() + "; -mileage = " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if(this.tripComputer != null){
            info += "Trip computer: 'functional'" + "\n";
        }else {
            info += "Trip computer: 'n/a'" + "\n";
        }
        if(this.gpsNavigator != null){
            info += "GPSNavigator: 'functional'" + "\n";
        }else {
            info += "GPSNavigator: 'n/a'" + "\n";
        }
        return info;
    }
}
