package com.vladproduction.pub_sub_practice.pub_sub_threads.priorityBlockingQueue.object;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class MySubscriberCar extends Thread{

    private BlockingQueue queue;

    public MySubscriberCar(BlockingQueue queue) {
        this.queue = queue;
    }


    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()){
            try {
                Thread.sleep(3000);
                Object result = queue.take();
                System.out.println("subscriber car consume " + result);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }



}
