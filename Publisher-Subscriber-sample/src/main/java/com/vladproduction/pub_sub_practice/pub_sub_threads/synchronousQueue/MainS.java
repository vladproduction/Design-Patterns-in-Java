package com.vladproduction.pub_sub_practice.pub_sub_threads.synchronousQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class MainS {
    public static void main(String[] args) {

        BlockingQueue queue = new SynchronousQueue(); //no capacity; it is ArrayBlockingQueue(capacity = 1) does`t print 'after put...'
        //BlockingQueue queue = new ArrayBlockingQueue(1); //the different from synchronous that : in arrayBlockingQueue while go to the next iteration
                                                            //we can see 'after put...'
        MyPublisherS publisher = new MyPublisherS(queue);
        publisher.start();

        MySubscriberS subscriber = new MySubscriberS(queue);
        subscriber.start();


    }
}
