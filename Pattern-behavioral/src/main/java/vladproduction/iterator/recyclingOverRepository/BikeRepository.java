package vladproduction.iterator.recyclingOverRepository;

import java.util.Iterator;

public class BikeRepository implements Iterable<Bike> {


    private Bike bike;
    private Bike [] bikes;
    private int index;

    public BikeRepository() {
        this.bikes = new Bike[10];
        this.index = 0;
    }

    public void addBike(Bike bike){

        if (index== bikes.length){
            Bike [] largerBikes = new Bike [bikes.length+5];
            System.arraycopy(bikes,0,largerBikes,0,bikes.length);
            bikes = largerBikes;
            largerBikes = null;
        }
        bikes[index] = bike;
        index++;
    }

    @Override
    public Iterator<Bike> iterator() {
        Iterator<Bike> it = new Iterator<Bike>() {

            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public Bike next() {
                return bikes[currentIndex++];
            }
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}
