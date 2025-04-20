package com.vladproduction.creational.builder;

public interface HouseBuilder {

    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void buildInterior();
    House getResult();

}
