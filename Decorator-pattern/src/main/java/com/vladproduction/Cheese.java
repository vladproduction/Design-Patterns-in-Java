package com.vladproduction;

public class Cheese extends ToppingDecorator{

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double cost() {
        return pizza.cost() + 1.50; //cost for cheese topic
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }
}
