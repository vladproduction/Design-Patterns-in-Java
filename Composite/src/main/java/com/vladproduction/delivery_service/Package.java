package com.vladproduction.delivery_service;

public class Package implements DeliveryComponent{

    private final String name;
    private final double priceByKm;
    private double distance;

    public Package(String name, double priceByKm) {
        this.name = name;
        this.priceByKm = priceByKm;
        this.distance = 0;
    }

    @Override
    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void deliver() {
        System.out.println("Delivering package: " + name);
    }

    @Override
    public double getCost() {
        return priceByKm * distance;
    }

    @Override
    public void notifyArrival() {
        System.out.println("Package " + name + " has arrived and is available for pickup!");
    }
}
