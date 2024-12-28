package com.vladproduction.news;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class MagazineStorage {

    private final Map<String, Magazine> magazineMap;

    public MagazineStorage() {
        magazineMap = new HashMap<>();
    }

    public void addMagazine(Magazine magazine){
        magazineMap.put(magazine.getTitle(), magazine);
    }

    public Magazine getMagazine(String title){
        return magazineMap.get(title);
    }

    public void removeMagazine(String title){
        magazineMap.remove(title);
    }

    // Apply a discount for old issues (more than 3 months old)
    public void applyDiscountForOldIssues() {
        LocalDate now = LocalDate.now();
        for (Magazine magazine : magazineMap.values()) {
            LocalDate issueDate = now.minusMonths(3); // Assuming issueDate should be set or calculated
            // If a magazine has an issue date older than 3 months ago, apply a discount
            if (Period.between(issueDate, now).getMonths() > 3) {
                double discountedPrice = magazine.getPrice() * 0.75; // 25% discount
                System.out.printf("Applying discount on %s: new price is %.2f (old price was %.2f)%n",
                        magazine.getTitle(), discountedPrice, magazine.getPrice());
                // Update the magazine price (you might want to set a method for this in Magazine class)
                magazine.notifyPriceChange(discountedPrice);  // This updates the subscribers too
            }
        }
    }

    //list of all magazines:
    public void listMagazines(){
        for (String title : magazineMap.keySet()) {
            Magazine magazine = magazineMap.get(title);
            System.out.printf("Title: %s, Price: %.2f, Issue: %s%n",
                    magazine.getTitle(),
                    magazine.getPrice(),
                    magazine.getIssue());
        }
    }
}
