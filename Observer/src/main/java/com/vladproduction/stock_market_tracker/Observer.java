package com.vladproduction.stock_market_tracker;

public interface Observer {

    void update(String stockSymbol, double price);

}
