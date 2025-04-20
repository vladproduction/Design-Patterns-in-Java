package com.vladproduction.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        // Create subject
        NewsAgency agency = new NewsAgency();

        // Create observers
        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");
        NewsChannel channel3 = new NewsChannel("Channel 3");

        // Register observers
        agency.registerObserver(channel1);
        agency.registerObserver(channel2);
        agency.registerObserver(channel3);

        // Set news which triggers notification
        agency.setNews("Breaking News: Important event occurred!");

        // Remove one observer
        agency.removeObserver(channel2);

        // Set new news
        agency.setNews("Update: More details about the event.");
    }
}
