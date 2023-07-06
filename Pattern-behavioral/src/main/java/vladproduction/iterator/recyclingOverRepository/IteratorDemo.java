package vladproduction.iterator.recyclingOverRepository;

import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        BikeRepository bikes = new BikeRepository();
        bikes.addBike(new Bike("Polygon"));
        bikes.addBike(new Bike("Scott"));
        bikes.addBike(new Bike("BMC"));
        bikes.addBike(new Bike("Cervelo"));
        bikes.addBike(new Bike("Giant"));

        Iterator<Bike> bikeIterator = bikes.iterator();

        System.out.println("bikeIterator:");
//        while (bikeIterator.hasNext()){
//            System.out.println(bikeIterator.next());
//        }
        System.out.println("bikes:");
        int count = 0;
        for (Bike item:bikes) {
            count++;
            System.out.println(count + ")"+item);
        }

    }
}
