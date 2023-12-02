package com.vladproduction.pub_sub_practice.pub_sub_threads.priorityBlockingQueue.object;

import java.util.Objects;

public class Car implements Comparable{

    private int year;
    private String model;

    public Car() {
    }

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return year == car.year && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Car other = (Car)o;

        return  -(year - other.year); //which car is oldest to consume
    }
}
