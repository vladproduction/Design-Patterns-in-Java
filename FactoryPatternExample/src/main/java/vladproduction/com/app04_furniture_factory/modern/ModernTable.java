package vladproduction.com.app04_furniture_factory.modern;

import vladproduction.com.app04_furniture_factory.Furniture;

public class ModernTable implements Furniture {

    @Override
    public void create() {
        System.out.println("Modern Table created");
    }
}
