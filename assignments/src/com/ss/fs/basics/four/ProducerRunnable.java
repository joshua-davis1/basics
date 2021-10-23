package com.ss.fs.basics.four;

import java.util.Random;

public class ProducerRunnable implements Runnable {

    private final Threader threader = Threader.getInstance();
    private final Random random = new Random();


    @Override
    public void run() {
        while(true) {
            Integer[] dataStream = threader.getDataStream();

            int i = 0;
            for (Integer packet: dataStream) {
                if (packet == null) {
                    synchronized (threader) {
                        dataStream = threader.getDataStream();
                        if(dataStream[i] == null) {
                            int randNumb = getRandomNum();
                            System.out.println(Thread.currentThread().getName() + ": produced packet +" + randNumb + "+");
                            threader.setPacket(randNumb, i);
                        }
                    }
                }
                i++;
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
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
