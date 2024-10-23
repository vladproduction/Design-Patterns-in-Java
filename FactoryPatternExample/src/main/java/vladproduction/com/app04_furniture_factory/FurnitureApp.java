package vladproduction.com.app04_furniture_factory;

import vladproduction.com.app04_furniture_factory.classic.ClassicFurnitureFactory;
import vladproduction.com.app04_furniture_factory.modern.ModernFurnitureFactory;
import vladproduction.com.app04_furniture_factory.vintage.VintageFurnitureFactory;

import static vladproduction.com.app04_furniture_factory.FurnitureType.*;

public class FurnitureApp {
    public static void main(String[] args) {
        classic();
        modern();
        vintage();
    }

    private static void classic() {
        FurnitureFactory classicFactory = new ClassicFurnitureFactory();
        produce(classicFactory);
    }

    private static void modern() {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        produce(modernFactory);
    }

    private static void vintage() {
        FurnitureFactory vintageFactory = new VintageFurnitureFactory();
        produce(vintageFactory);
    }

    private static void produce(FurnitureFactory classicFactory) {
        Furniture classicChair = classicFactory.createFurniture(CHAIR);
        Furniture classicTable = classicFactory.createFurniture(TABLE);
        Furniture classicSofa = classicFactory.createFurniture(SOFA);
        Furniture[] classic = {classicChair, classicTable, classicSofa};
        for (Furniture furniture : classic) {
            furniture.create();
        }
    }
}
