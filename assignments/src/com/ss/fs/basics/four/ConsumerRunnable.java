package com.ss.fs.basics.four;

public class ConsumerRunnable implements Runnable{
    private final Threader threader = Threader.getInstance();

    @Override
    public void run() {
        while(true) {
            Integer[] dataStream = threader.getDataStream();
            int i =0;
            for (Integer packet: dataStream) {
                if (packet != null) {
                    synchronized (threader) {
                        dataStream = threader.getDataStream();
                        if (dataStream[i] != null) {
                            System.out.println(Thread.currentThread().getName() + ": consumed packet +" + dataStream[i] + "+"+" index: "+i);
                            threader.setPacket(null, i);
                        }
                    }
                    i++;
                    break;
                }
                i++;
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
