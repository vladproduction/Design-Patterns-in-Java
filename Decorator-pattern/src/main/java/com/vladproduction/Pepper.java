package com.vladproduction;

public class Pepper extends ToppingDecorator{

    public Pepper(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.50; //cost for pepper topic
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepper";
    }
}
