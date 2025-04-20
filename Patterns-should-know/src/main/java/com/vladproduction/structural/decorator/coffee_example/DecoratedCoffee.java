package com.vladproduction.structural.decorator.coffee_example;

public abstract class DecoratedCoffee implements Coffee {

    protected Coffee coffee;

    public DecoratedCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription();
    }

    @Override
    public double getPrice() {
        return this.coffee.getPrice();
    }
}
