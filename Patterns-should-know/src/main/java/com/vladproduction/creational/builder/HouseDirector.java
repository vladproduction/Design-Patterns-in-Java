package com.vladproduction.creational.builder;

public class HouseDirector {

    public void constructHouse(HouseBuilder house) {
        house.buildFoundation();
        house.buildStructure();
        house.buildRoof();
        house.buildInterior();
    }

}
