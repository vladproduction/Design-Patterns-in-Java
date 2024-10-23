package vladproduction.com.app03_car_factory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import vladproduction.com.app03_car_factory.factories.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactoryTest {

    @Test
    public void factoryProducerTest(){
        Factory sedanFactory = FactoryProducer.getFactory(0);
        assertTrue(sedanFactory.getClass() == SedanFactory.class);
        Factory sportFactory = FactoryProducer.getFactory(1);
        assertTrue(sportFactory.getClass() == SportFactory.class);
        Factory suvFactory = FactoryProducer.getFactory(2);
        assertTrue(suvFactory.getClass() == SUVFactory.class);

        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Factory suvFactoryTest = FactoryProducer.getFactory(-123);
            }
        });

    }

    @Test
    public void sedanFactoryTest(){
        Factory sedanFactory = FactoryProducer.getFactory(0);
        Car carSedan = sedanFactory.assembleCar();
        assertTrue(carSedan.getClass() == Sedan.class);
    }

    @Test
    public void sportFactoryTest(){
        Factory sportFactory = FactoryProducer.getFactory(1);
        Car carSport = sportFactory.assembleCar();
        assertTrue(carSport.getClass() == Sport.class);
    }

    @Test
    public void suvFactoryTest(){
        Factory suvFactory = FactoryProducer.getFactory(2);
        Car carSport = suvFactory.assembleCar();
        assertTrue(carSport.getClass() == SUV.class);
    }
}
