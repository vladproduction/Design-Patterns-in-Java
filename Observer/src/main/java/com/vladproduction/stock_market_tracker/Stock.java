package com.vladproduction.stock_market_tracker;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private String stockSymbol;
    private double price;
    private List<Observer> observers;

    public Stock(String stockSymbol, double price) {
        this.stockSymbol = stockSymbol;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void setPrice(double price){
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockSymbol, price);
        }
    }
}
