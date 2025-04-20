package com.vladproduction.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{

    private String news;
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    // method to set the news and notify the observers
    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

}
