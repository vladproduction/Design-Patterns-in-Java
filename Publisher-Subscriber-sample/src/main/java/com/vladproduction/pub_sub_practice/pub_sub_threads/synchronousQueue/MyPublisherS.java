package com.vladproduction.pub_sub_practice.pub_sub_threads.synchronousQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class MyPublisherS extends Thread{

    private BlockingQueue queue;

    public MyPublisherS(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            System.out.println("publisher created " + i);
            try {
                queue.put(i);
                System.out.println("\tafter put...");
                i++;
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
