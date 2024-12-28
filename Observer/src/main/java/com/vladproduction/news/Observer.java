package com.vladproduction.news;


public interface Observer {

    void updateTitle(String newTitle);

    void updatePrice(double newPrice);

    void updateIssue(String newIssue);

}
