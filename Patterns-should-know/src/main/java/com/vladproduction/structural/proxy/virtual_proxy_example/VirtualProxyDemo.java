package com.vladproduction.structural.proxy.virtual_proxy_example;

// Client code
public class VirtualProxyDemo {
    public static void main(String[] args) {

        System.out.println("Starting application...");

        // Create the application with a virtual proxy
        ContactListApplication app = new ContactListApplication(new VirtualContactList());

        // Do some operations that don't require contact list
        app.doSomethingElse();

        System.out.println("\nUser requests to see contacts");
        // Only now the real contact list will be created
        app.printContactList();

        System.out.println("\nUser requests to see contacts again");
        // Second request uses the already loaded contact list
        app.printContactList();


    }
}
