package vladproduction.com.app04_furniture_factory.classic;

import vladproduction.com.app04_furniture_factory.Furniture;
import vladproduction.com.app04_furniture_factory.FurnitureFactory;
import vladproduction.com.app04_furniture_factory.FurnitureType;
import vladproduction.com.app04_furniture_factory.modern.ModernChair;
import vladproduction.com.app04_furniture_factory.modern.ModernSofa;
import vladproduction.com.app04_furniture_factory.modern.ModernTable;

import static vladproduction.com.app04_furniture_factory.FurnitureType.*;

public class ClassicFurnitureFactory implements FurnitureFactory {

    @Override
    public Furniture createFurniture(FurnitureType type) {

        return switch (type) {
            case CHAIR -> new ClassicChair();
            case TABLE -> new ClassicTable();
            case SOFA -> new ClassicSofa();
            default -> null;
        };
    }
}
