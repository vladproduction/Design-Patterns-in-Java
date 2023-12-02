package com.vladproduction.pub_sub_practice.pub_sub_threads.priorityBlockingQueue.object;

import java.util.concurrent.*;

public class MainCar {
    public static void main(String[] args) throws InterruptedException {

        BlockingQueue queue = new PriorityBlockingQueue();//no capacity;

        MyPublisherCar publisher = new MyPublisherCar(queue);
        publisher.start();

        MySubscriberCar subscriber = new MySubscriberCar(queue); //priority base on compareTo (the oldest car - out)
        subscriber.start();

    }
}
