package com.vladproduction.pub_sub_practice.pub_sub_threads.arrayBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class MySubscriberA extends Thread{

    private BlockingQueue queue;

    public MySubscriberA(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true){
            try{
                TimeUnit.SECONDS.sleep(3);
                Object res = queue.take();
                System.out.println("subscriber consumed " + res);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
