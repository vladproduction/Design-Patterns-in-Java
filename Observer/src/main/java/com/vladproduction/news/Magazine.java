package com.vladproduction.news;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Magazine implements Subject {

    private String title;
    private double price;
    private String issue;
    private LocalDate issueDate;  //for discount logic
    private List<Observer> subscribers;

    public Magazine(String title, double price, String issue, LocalDate issueDate) {
        this.title = title;
        this.price = price;
        this.issue = issue;
        this.issueDate = issueDate;
        this.subscribers = new ArrayList<>();
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getIssue() {
        return issue;
    }

    @Override
    public void attach(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyTitleChange(String newTitle) {
        this.title = newTitle;
        for (Observer subscriber : subscribers) {
            subscriber.updateTitle(newTitle);
        }
    }

    @Override
    public void notifyPriceChange(double newPrice) {
        this.price = newPrice;
        for (Observer subscriber : subscribers) {
            subscriber.updatePrice(newPrice);
        }
    }

    @Override
    public void notifyIssueChange(String newIssue) {
        this.issue = newIssue;
        for (Observer subscriber : subscribers) {
            subscriber.updateIssue(newIssue);
        }
    }
}
