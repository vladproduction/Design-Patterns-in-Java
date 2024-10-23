package vladproduction.com.app04_furniture_factory.modern;

import vladproduction.com.app04_furniture_factory.Furniture;

public class ModernChair implements Furniture {

    @Override
    public void create() {
        System.out.println("Modern Chair created");
    }
}
