package vladproduction.com.app03_car_factory.main;

import vladproduction.com.app03_car_factory.factories.*;

public class MainApp03 {
    public static void main(String[] args) {

        System.out.println("---------");
        Factory sedanFactory = FactoryProducer.getFactory(0);
        sedanFactory.assembleCar();

        System.out.println("---------");
        Factory suvFactory = FactoryProducer.getFactory(2);
        suvFactory.assembleCar();

        System.out.println("---------");
        Factory sportFactory = FactoryProducer.getFactory(1);
        sportFactory.assembleCar();
    }
}
