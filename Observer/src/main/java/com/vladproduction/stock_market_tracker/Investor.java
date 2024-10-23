package com.vladproduction.stock_market_tracker;

public class Investor implements Observer{

    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.format("Investor %s Stock: %s is now price %s%n", name, stockSymbol, price);
    }
}
