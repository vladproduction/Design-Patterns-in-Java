package vladproduction.builder.carBuilder;


import vladproduction.builder.carBuilder.builders.CarBuilder;
import vladproduction.builder.carBuilder.cars.Car;
import vladproduction.builder.carBuilder.director.Director;

public class Main02 {
    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        Car carBuilderResult = carBuilder.getResult();
        System.out.println("Car built:\n" + carBuilderResult.getCarType());

//        CarManualBuilder carManualBuilder = new CarManualBuilder();
//        director.constructSportCar(carManualBuilder);
//        Manual carManualBuilderResult = carManualBuilder.getResult();
//        System.out.println("\nCar manual built:\n" + carManualBuilderResult.print());


    }
}
