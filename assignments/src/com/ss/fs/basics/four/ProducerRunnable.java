package com.ss.fs.basics.four;

import java.util.Arrays;
import java.util.Random;

public class ProducerRunnable implements Runnable{
    private final Random random = new Random();
    private final Threader threader;

    public ProducerRunnable(Threader threader) {
        this.threader = threader;
    }

    @Override
    public void run() {
        while(true){
            int[] packets = new int[10];
            // insert random values into packets arr
            for(int i=0;i<packets.length;i++) {
                packets[i] = getRandomNum();
            }

            for (int packet : packets) {
                System.out.println(Thread.currentThread().getName()+": sent packet +"+packet+"+");
                synchronized (threader) {
                    threader.send(packet);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            sleep();
        }

    }

    void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    int getRandomNum() {
        int num = random.nextInt(10000) + 1;
        return num;
    }
}
