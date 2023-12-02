package com.vladproduction.pub_sub_practice.property_change_support;

public class Main02 {
    public static void main(String[] args) {

        SubscriberOne subscriberOne = new SubscriberOne();

        Person person1 = new Person();
        person1.addSubscriber(subscriberOne);
        person1.setName("John");
        person1.setAge(20);

        /*  SubscriberOne
            source = Person{name='null', age=0}
            propertyName = name
            oldValue = null
            newValue = John
            SubscriberOne
            source = Person{name='John', age=0}
            propertyName = age
            oldValue = 0
            newValue = 20       */

        System.out.println("-------------------");
        //can work with other class as well:
        Student student = new Student();
        student.addSubscriber(subscriberOne);
        student.setName("Jack");
        student.setAge(23);
        System.out.println("-----no changes (or set same value)--------------");
        //and if it is no any changes (or set same value), we do not receiving notifications
        student.setAge(23);
        System.out.println("----change age---------------");
        //let`s change age for Person and Student
        person1.setAge(21);
        student.setAge(24);
    }


}
