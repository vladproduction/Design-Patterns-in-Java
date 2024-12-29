package com.vladproduction;

public class Olive extends ToppingDecorator{

    public Olive(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.70; //cost for olive topic
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olive";
    }
}
