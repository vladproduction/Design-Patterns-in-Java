package com.vladproduction.weather_station;

public interface ObserverWeather {

    void update(double temperature, double humidity, double pressure);

}
