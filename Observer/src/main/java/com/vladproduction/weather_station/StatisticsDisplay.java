package com.vladproduction.weather_station;

public class StatisticsDisplay implements ObserverWeather{

    private double minTemperature = Double.MIN_VALUE;
    private double maxTemperature = Double.MAX_VALUE;
    private double totalTemperature = 0;
    private int numberOfReadings = 0;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        totalTemperature += temperature;
        numberOfReadings++;

        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }
        if (temperature < minTemperature) {
            minTemperature = temperature;
        }
        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature: " + (totalTemperature / numberOfReadings) + "/" + maxTemperature + "/" + minTemperature);
    }

}
