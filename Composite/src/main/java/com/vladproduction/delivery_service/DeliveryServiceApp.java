package com.vladproduction.delivery_service;

public class DeliveryServiceApp {
    public static void main(String[] args) {

        DeliveryComponent package1 = new Package("Electronics", 0.5); // $0.5 per km
        DeliveryComponent package2 = new Package("Books", 0.3); // $0.3 per km

        Shipment shipment = new Shipment("Holiday Gifts", 0.4); // $0.4 per km
        shipment.addComponent(package1);
        shipment.addComponent(package2);

        // Set the distance for the shipment
        double distanceInKm = 10; // For example, 10 km
        shipment.setDistance(distanceInKm);

        // Deliver the shipment
        shipment.deliver();

        // Notify about arrival
        shipment.notifyArrival();

        // Show total cost of shipment
        System.out.println("Total cost of shipment: $" + shipment.getCost());

    }
}
