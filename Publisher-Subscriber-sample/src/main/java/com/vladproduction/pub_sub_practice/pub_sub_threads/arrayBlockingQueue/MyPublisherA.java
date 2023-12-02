package com.vladproduction.pub_sub_practice.pub_sub_threads.arrayBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class MyPublisherA extends Thread {

    private BlockingQueue queue;

    public MyPublisherA(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("publisher created " + i);
            try {
                queue.put(i);
                i++;
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
