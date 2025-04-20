package com.vladproduction.structural.decorator.coffee_example;

public class MilkDecorator extends DecoratedCoffee {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Milk";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }
}
