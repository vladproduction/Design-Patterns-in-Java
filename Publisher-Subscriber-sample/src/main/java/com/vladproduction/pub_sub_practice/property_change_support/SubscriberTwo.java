package com.vladproduction.pub_sub_practice.property_change_support;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class SubscriberTwo implements PropertyChangeListener {


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        //when something changed this method going to action
        System.out.println("SubscriberTwo");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //how we can track our events:
        Object source = evt.getSource();
        String propertyName = evt.getPropertyName();
        Object oldValue = evt.getOldValue();
        Object newValue = evt.getNewValue();

        System.out.println("source = " + source);
        System.out.println("propertyName = " + propertyName);
        System.out.println("oldValue = " + oldValue);
        System.out.println("newValue = " + newValue);
    }
}
