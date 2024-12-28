package com.vladproduction.news;

import java.time.LocalDate;

public class MainNewsApp {
    public static void main(String[] args) {

        // Create storage for magazines
        MagazineStorage storage = new MagazineStorage();

        // Create subscribers
        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");

        // Create magazines with an appropriate issue date
        Magazine magazine1 = new Magazine("Tech Monthly", 5.99, "January 2025", LocalDate.of(2025, 1, 1));
        magazine1.attach(subscriber1);
        magazine1.attach(subscriber2);
        storage.addMagazine(magazine1);

        Magazine magazine2 = new Magazine("Travel Guide", 4.99, "Winter 2025", LocalDate.of(2025, 1, 1));
        magazine2.attach(subscriber1); // Subscriber 1 also subscribes to Travel Guide
        storage.addMagazine(magazine2);

        // List all magazines in storage
        System.out.println("Listing all magazines in storage:");
        storage.listMagazines();

        // Simulate updates to the first magazine
        magazine1.notifyTitleChange("Tech Monthly (Special Edition)");
        magazine1.notifyPriceChange(6.99);
        magazine1.notifyIssueChange("February 2025");

        // Apply discounts for old issues
        System.out.println("\nApplying discounts for old issues:");
        storage.applyDiscountForOldIssues();

        // Remove the first magazine from storage
        storage.removeMagazine("Tech Monthly (Special Edition)");
        System.out.println("\nListing all magazines after removing Tech Monthly:");
        storage.listMagazines();


    }

}
