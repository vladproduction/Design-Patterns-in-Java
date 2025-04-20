package com.vladproduction.behavioral.observer;

// Subject interface
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
