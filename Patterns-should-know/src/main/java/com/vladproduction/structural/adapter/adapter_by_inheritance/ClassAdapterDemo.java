package com.vladproduction.structural.adapter.adapter_by_inheritance;

public class ClassAdapterDemo {
    public static void main(String[] args) {
        // Using the adapter
        Target target = new ClassAdapter();
        target.request();
    }
}
