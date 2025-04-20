package com.vladproduction.creational.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {

        HouseDirector director = new HouseDirector();

        HouseBuilder woodenBuilder = new WoodenHouseBuilder();
        director.constructHouse(woodenBuilder);
        House woodenHouse = woodenBuilder.getResult();
        System.out.println("Wooden House: " + woodenHouse);

        HouseBuilder brickBuilder = new BrickHouseBuilder();
        director.constructHouse(brickBuilder);
        House brickHouse = brickBuilder.getResult();
        System.out.println("Brick House: " + brickHouse);

    }
}
