package vladproduction.com.app04_furniture_factory.vintage;

import vladproduction.com.app04_furniture_factory.Furniture;
import vladproduction.com.app04_furniture_factory.FurnitureFactory;
import vladproduction.com.app04_furniture_factory.FurnitureType;
import vladproduction.com.app04_furniture_factory.modern.ModernChair;
import vladproduction.com.app04_furniture_factory.modern.ModernSofa;
import vladproduction.com.app04_furniture_factory.modern.ModernTable;

public class VintageFurnitureFactory implements FurnitureFactory {

    @Override
    public Furniture createFurniture(FurnitureType type) {

        return switch (type) {
            case CHAIR -> new VintageChair();
            case TABLE -> new VintageTable();
            case SOFA -> new VintageSofa();
            default -> null;
        };
    }
}
