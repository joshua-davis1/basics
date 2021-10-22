package com.ss.fs.basics.four;

public class ConsumerRunnable implements Runnable{
    private final Threader threader;

    public ConsumerRunnable(Threader threader) {
        this.threader = threader;
    }

    @Override
    public void run() {
        synchronized (threader) {
            for(int newPacket = threader.receive(); true; newPacket = threader.receive()) {
                System.out.println(Thread.currentThread().getName()+": received packet +"+newPacket+"+");
            }
        }
    }

}
