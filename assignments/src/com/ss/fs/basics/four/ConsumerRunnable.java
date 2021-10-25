package com.ss.fs.basics.four;

import java.time.LocalTime;
import java.util.PriorityQueue;

public class ConsumerRunnable implements Runnable{
    private final Threader threader = Threader.getInstance();

    @Override
    public void run() {
        while(true) {
            if(threader.getQueue().peek() != null) {
                synchronized (threader) {
                    PriorityQueue<Integer> queue = threader.getQueue();
                    if (queue.peek() != null) {
                        int polled = queue.poll();
                        System.out.println(Thread.currentThread().getName() + " (-) consumed packet " + polled + " @ " + LocalTime.now());
                    }
                }
            }
        sleep();
        }
    }

    void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
