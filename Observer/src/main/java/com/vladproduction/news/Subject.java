package com.vladproduction.news;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyTitleChange(String newTitle);
    void notifyPriceChange(double newPrice);
    void notifyIssueChange(String newIssue);

}
