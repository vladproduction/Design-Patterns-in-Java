package com.vladproduction.structural.adapter.adapter_by_inheritance;

// Class Adapter using inheritance
public class ClassAdapter extends Adaptee implements Target{

    @Override
    public void request() {

        // Calling the specific request
        specificRequest();
        System.out.println("ClassAdapter: Adapted the specific request to Target interface");

    }
}
