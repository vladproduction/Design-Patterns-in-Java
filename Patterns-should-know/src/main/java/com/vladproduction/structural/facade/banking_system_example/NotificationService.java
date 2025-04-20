package com.vladproduction.structural.facade.banking_system_example;

public class NotificationService {

    public void sendNotification(String accountNo, String message) {
        System.out.println("Sending notification to account " + accountNo + ": " + message);
    }

}
