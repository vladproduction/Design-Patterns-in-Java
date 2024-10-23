package com.vladproduction.weather_station;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject Class
 * */
public class WeatherStation {

    private List<ObserverWeather> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void addObserver(ObserverWeather observer) {
        observers.add(observer);
    }

    public void removeObserver(ObserverWeather observer) {
        observers.remove(observer);
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void notifyObservers() {
        for (ObserverWeather observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

}
