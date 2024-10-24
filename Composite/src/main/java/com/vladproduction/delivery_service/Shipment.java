package com.vladproduction.delivery_service;

import java.util.ArrayList;
import java.util.List;

public class Shipment implements DeliveryComponent{

    private String shipmentName;
    private List<DeliveryComponent> components = new ArrayList<>();
    private double costPerKm; // Cost per kilometer for the shipment
    private double distance;   // Total distance

    public Shipment(String shipmentName, double costPerKm) {
        this.shipmentName = shipmentName;
        this.costPerKm = costPerKm;
        this.distance = 0; // Initialize distance
    }

    public void addComponent(DeliveryComponent component){
        components.add(component);
    }

    @Override
    public void deliver() {
        System.out.println("Delivering shipment: " + shipmentName);
        for (DeliveryComponent component : components) {
            component.deliver();
        }
    }

    @Override
    public double getCost() {
        // Calculate total cost based on distance for each component
        double totalCost = 0.0;
        for (DeliveryComponent component : components) {
            totalCost += component.getCost();
        }
        return totalCost;
    }

    @Override
    public void notifyArrival() {
        System.out.println("Shipment " + shipmentName + " has arrived and is available for pickup!");
        for (DeliveryComponent component : components) {
            component.notifyArrival();
        }

    }

    @Override
    public void setDistance(double distance) {
        this.distance = distance; //sett distance for the shipment
        for (DeliveryComponent component : components) {
            component.setDistance(distance); // distance for each package
        }

    }
}
