package com.vladproduction.structural.decorator.coffee_example;

public class SugarDecorator extends DecoratedCoffee{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ",  with Sugar";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.3;
    }
}
