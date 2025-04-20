package com.vladproduction.behavioral.observer;

public class NewsChannel implements Observer{

    private String name;
    private String latestNews;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.latestNews = message;
        display();
    }

    public void display() {
        System.out.println(name + " received news: " + latestNews);
    }

}
