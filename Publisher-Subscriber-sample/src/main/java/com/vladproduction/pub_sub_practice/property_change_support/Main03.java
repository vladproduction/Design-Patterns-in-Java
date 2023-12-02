package com.vladproduction.pub_sub_practice.property_change_support;

public class Main03 {
    public static void main(String[] args) {

        SubscriberOne subscriberOne = new SubscriberOne();
        SubscriberTwo subscriberTwo = new SubscriberTwo();

        Person person1 = new Person();
        person1.addSubscriber(subscriberOne);
        person1.setName("John");
        person1.setAge(20);

        System.out.println("-------------------");
        //can work with other class as well:
        Student student = new Student();
//        student.addSubscriber(subscriberOne); //work first
//        student.addSubscriber(subscriberTwo); //work second

        //now we set for subscriberTwo sleep 5 sec, and invoke subscriberTwo first:
        student.addSubscriber(subscriberTwo);
        student.addSubscriber(subscriberOne);
        //after that we can see thread delay when subscriberTwo trying to track changes, and fields checked one-by-one;
        //so still 'Two' doing work, all have to wait for this field
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
