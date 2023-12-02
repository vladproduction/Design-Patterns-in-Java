package com.vladproduction.pub_sub_practice.pub_sub_threads.priorityBlockingQueue.integer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class MyPublisherP extends Thread {

    private BlockingQueue queue;

    public MyPublisherP(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while (i <= 5) {
            try {
                System.out.println("publisher created " + i);
                queue.put(i);
                i++;

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
