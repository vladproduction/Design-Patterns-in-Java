package com.vladproduction.pub_sub_practice.pub_sub_threads.priorityBlockingQueue.integer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class MainP {
    public static void main(String[] args) {

        //BlockingQueue queue = new SynchronousQueue(); //no capacity; it is ArrayBlockingQueue(capacity = 1) does`t print 'after put...'
        //BlockingQueue queue = new ArrayBlockingQueue(1); //the different from synchronous that while go to the next iteration
                                                            //we can see 'after put...'
        BlockingQueue queue = new PriorityBlockingQueue();//no capacity;
        //no blocking, publishing all time; but taking by priority;
        //for integer it is simple to get priority;
        //but if we have Object


        MyPublisherP publisher = new MyPublisherP(queue);
        publisher.start();

        MySubscriberP subscriber = new MySubscriberP(queue);
        subscriber.start();



    }
}
