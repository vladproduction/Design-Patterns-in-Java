package com.vladproduction.pub_sub_practice.pub_sub_threads.arrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainA {
    public static void main(String[] args) {

        BlockingQueue queue = new ArrayBlockingQueue(10);

        MyPublisherA publisher = new MyPublisherA(queue);
        publisher.start();

//        MySubscriberA subscriber = new MySubscriberA(queue);
//        subscriber.start();

        //if we have 10 subscribers at once
        for (int i = 0; i < 10; i++) {
            MySubscriberA subscriber = new MySubscriberA(queue);
            subscriber.start();
        }

    }
}
