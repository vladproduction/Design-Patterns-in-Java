package vladproduction.com.app04_furniture_factory.vintage;

import vladproduction.com.app04_furniture_factory.Furniture;

public class VintageTable implements Furniture {

    @Override
    public void create() {
        System.out.println("Vintage Table created");
    }
}
