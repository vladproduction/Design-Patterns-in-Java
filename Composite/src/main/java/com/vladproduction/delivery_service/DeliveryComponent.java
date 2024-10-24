package com.vladproduction.delivery_service;

public interface DeliveryComponent {
    void deliver();
    double getCost();
    void notifyArrival();
    void setDistance(double distance);
}
