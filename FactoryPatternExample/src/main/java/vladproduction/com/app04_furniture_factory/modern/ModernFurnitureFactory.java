package vladproduction.com.app04_furniture_factory.modern;

import vladproduction.com.app04_furniture_factory.Furniture;
import vladproduction.com.app04_furniture_factory.FurnitureFactory;
import vladproduction.com.app04_furniture_factory.FurnitureType;
import vladproduction.com.app04_furniture_factory.classic.ClassicChair;
import vladproduction.com.app04_furniture_factory.classic.ClassicSofa;
import vladproduction.com.app04_furniture_factory.classic.ClassicTable;
import vladproduction.com.app04_furniture_factory.modern.ModernChair;
import vladproduction.com.app04_furniture_factory.modern.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Furniture createFurniture(FurnitureType type) {

        return switch (type) {
            case CHAIR -> new ModernChair();
            case TABLE -> new ModernTable();
            case SOFA -> new ModernSofa();
            default -> null;
        };
    }
}
