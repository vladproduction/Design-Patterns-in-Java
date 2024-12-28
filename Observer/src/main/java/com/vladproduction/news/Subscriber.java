package com.vladproduction.news;

public class Subscriber implements Observer{

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void updateTitle(String newTitle) {
        System.out.printf("%s received an update: New Title: %s%n", name, newTitle);
    }

    @Override
    public void updatePrice(double newPrice) {
        System.out.printf("%s received an update: New Price: %.2f%n", name, newPrice);
    }

    @Override
    public void updateIssue(String newIssue) {
        System.out.printf("%s received an update: New Issue: %s%n", name, newIssue);
    }

}
