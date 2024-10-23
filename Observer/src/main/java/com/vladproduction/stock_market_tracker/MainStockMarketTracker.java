package com.vladproduction.stock_market_tracker;

public class MainStockMarketTracker {
    public static void main(String[] args) {
        Stock faangStock = new Stock("FAANG", 2800.00);
        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

        faangStock.addObserver(investor1);
        faangStock.addObserver(investor2);

        // Changing stock price
        faangStock.setPrice(2825.00);
        faangStock.setPrice(2790.50);
    }
}
