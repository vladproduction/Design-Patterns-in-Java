package com.vladproduction.weather_station;

public class WeatherStationApp {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(statisticsDisplay);
        weatherStation.addObserver(forecastDisplay);

        // Simulating weather data updates
        weatherStation.setMeasurements(25.0, 65, 30.4);
        weatherStation.setMeasurements(27.0, 70, 29.9);
        weatherStation.setMeasurements(22.0, 90, 29.6);
    }

}
