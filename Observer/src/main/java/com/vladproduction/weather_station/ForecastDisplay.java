package com.vladproduction.weather_station;

public class ForecastDisplay implements ObserverWeather{

    private double currentPressure = 29.92; // Let's start with a default value
    private double lastPressure;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        String forecast;
        if (currentPressure > lastPressure) {
            forecast = "Improving weather on the way!";
        } else if (currentPressure == lastPressure) {
            forecast = "More of the same";
        } else {
            forecast = "Watch out for cooler, rainy weather!";
        }
        System.out.println("Forecast: " + forecast);
    }

}
