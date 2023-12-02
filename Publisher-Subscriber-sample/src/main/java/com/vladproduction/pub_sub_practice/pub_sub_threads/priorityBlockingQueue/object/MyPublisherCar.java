package com.vladproduction.pub_sub_practice.pub_sub_threads.priorityBlockingQueue.object;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class MyPublisherCar extends Thread {

    private BlockingQueue queue;

    public MyPublisherCar(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 1;
        while (i <= 5){
            System.out.println("Car# created: " + i);
            try {
                Car car = new Car();
                car.setModel("model " + i);
                car.setYear(i);
                queue.put(car);
                System.out.println("after put...car to queue: " + i);
                i++;
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
