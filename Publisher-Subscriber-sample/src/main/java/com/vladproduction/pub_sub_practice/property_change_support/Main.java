package com.vladproduction.pub_sub_practice.property_change_support;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("John", 20); //init person1
        //support sad to all listeners that has been created (changed: null,null --> value,value) Person
        //as long as we do not have any listeners(subscribers) no-one listening support;

        //create Listeners (Subscribers for our Publisher):
        SubscriberOne subscriberOne = new SubscriberOne();

        //now we have to subscribe our subscriber to our publisher, to do this we use public method from Person:
        person1.addSubscriber(subscriberOne);
        //at this moment we have person who will grow by age, and listener who will be notification abut this

        //do changes age: 20 --> 21;
        person1.setAge(21); //SubscriberOne - it sas us that our changes was received by subscriber
        //toString():
        //System.out.println(person1); //Person{name='John', age=21}
        //do changes name: John --> John Doe;
        person1.setName("John Doe");
        //System.out.println(person1); //Person{name='John Doe', age=21}

        //we modified SubscriberOne.propertyChange(): run our app again we can see all changes has been with Person in a row
    }
}
