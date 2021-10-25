package com.ss.fs.basics.four;

import java.time.LocalTime;
import java.util.PriorityQueue;
import java.util.Random;

public class ProducerRunnable implements Runnable {

    private final Threader threader = Threader.getInstance();
    private final Random random = new Random();


    @Override
    public void run() {
        // check and reproduce packets if queue is empty
        while(true) {
            if (threader.getQueue().peek() == null) {
                synchronized (threader) {
                    PriorityQueue<Integer> queue = threader.getQueue();
                    if (queue.peek() == null) {
                        System.out.println('\n'+Thread.currentThread().getName() + " que is empty " + queue + " @ "+ LocalTime.now());
                        for(int i=0;i<5;i++) {
                            int randNumb = getRandomNum();
                            queue.add(randNumb);
                        }
                        System.out.println(Thread.currentThread().getName() + " (+) que has be replenished " + threader.getQueue() + " @ "+ LocalTime.now()+'\n');
                    }
                }
            }
            sleep();
        }
    }

    int getRandomNum() {
        int num = random.nextInt(1000) + 1;
        return num;
    }

    void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
