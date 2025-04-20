package com.vladproduction.structural.proxy.virtual_proxy_example;

import java.util.List;

// Client Application
public class ContactListApplication {

    private final ContactList contactList;

    public ContactListApplication(ContactList contactList) {
        this.contactList = contactList;
        // The application starts quickly because the real contact list is not loaded yet
        System.out.println("Contact application initialized");
    }

    public void printContactList() {
        System.out.println("\nPrinting contact list:");

        // This will trigger loading the contact list if it hasn't been loaded yet
        List<String> contacts = contactList.getContactList();

        for (String contact : contacts) {
            System.out.println(" - " + contact);
        }
    }

    public void doSomethingElse() {
        System.out.println("Doing something else that doesn't require contact list");
    }

}
