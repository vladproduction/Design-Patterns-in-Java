package com.vladproduction.structural.decorator.coffee_example;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getPrice() {
        return 2.0;
    }
}
