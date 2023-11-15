package vladproduction.builder.carBuilder;


import vladproduction.builder.carBuilder.builders.CarBuilder;
import vladproduction.builder.carBuilder.builders.CarManualBuilder;
import vladproduction.builder.carBuilder.cars.Car;
import vladproduction.builder.carBuilder.cars.Manual;
import vladproduction.builder.carBuilder.director.Director;

//everything come together here
public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.

        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();

        // Director may know several building recipes.

        director.constructSportCar(carManualBuilder);
        Manual manual = carManualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + manual.print());

    }
}
