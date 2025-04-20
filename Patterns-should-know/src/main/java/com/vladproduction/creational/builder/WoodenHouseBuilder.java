package com.vladproduction.creational.builder;

public class WoodenHouseBuilder implements HouseBuilder{

    private final House house;

    public WoodenHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Wooden piles foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wooden beams structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wooden Roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Wooden interior");
    }

    @Override
    public House getResult() {
        return house;
    }
}
