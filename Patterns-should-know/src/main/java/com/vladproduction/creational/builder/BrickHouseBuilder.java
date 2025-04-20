package com.vladproduction.creational.builder;

public class BrickHouseBuilder implements HouseBuilder{

    private final House house;

    public BrickHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Brick walls");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Tile Roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Modern Interior");
    }

    @Override
    public House getResult() {
        return house;
    }
}
