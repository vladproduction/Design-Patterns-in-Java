package vladproduction.com.app04_furniture_factory.classic;

import vladproduction.com.app04_furniture_factory.Furniture;

public class ClassicChair implements Furniture {

    @Override
    public void create() {
        System.out.println("Classic Chair created");
    }
}
