package com.vladproduction.structural.proxy.virtual_proxy_example;

import java.util.ArrayList;
import java.util.List;

// Real Subject - expensive to create
public class RealContactList implements ContactList {

    private final List<String> contacts;

    public RealContactList() {
        this.contacts = new ArrayList<>();
        // Expensive operation - simulating database access or network call
        System.out.println("Fetching contact list from external system...");
        try {
            Thread.sleep(5000); // Simulate delay

            // Add some contacts
            contacts.add("Alice (alice@example.com)");
            contacts.add("Bob (bob@example.com)");
            contacts.add("Charlie (charlie@example.com)");
            contacts.add("Diana (diana@example.com)");
            contacts.add("Edward (edward@example.com)");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Contact list loaded with " + contacts.size() + " contacts");
    }

    @Override
    public List<String> getContactList() {
        return contacts;
    }

}
