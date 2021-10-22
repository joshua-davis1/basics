package com.ss.fs.basics.four;

public class ConsumerRunnable implements Runnable{
    private final Threader threader = Threader.getInstance();

    @Override
    public void run() {
        while(true) {
            Integer[] dataStream = threader.getDataStream();
            for (int i = 0; i < dataStream.length; i++) {
                if (dataStream[i] != null) {
                    synchronized (threader) {
                        dataStream = threader.getDataStream();
                        if (dataStream[i] != null) {
                            System.out.println(Thread.currentThread().getName() + ": consumed packet +" + dataStream[i] + "+"+" index: "+i);
                            threader.setPacket(null, i);
                        }
                    }
                    break;
                }
            }
            sleep();
        }
    }

    void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
