package com.vladproduction.structural.decorator.coffee_example;

public class CreamedDecorator extends DecoratedCoffee{

    public CreamedDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Creamed";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.7;
    }
}
