package com.vladproduction.pub_sub_practice.pub_sub_threads.synchronousQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class MySubscriberS extends Thread{

    private BlockingQueue queue;

    public MySubscriberS(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true){
            try{
                Object res = queue.take();
                System.out.println("subscriber consumed " + res);
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
