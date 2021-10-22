package com.ss.fs.basics.four;

public class Threader {
    volatile public static Threader instance = null;
    volatile private int packet;
    private boolean open = true;

    private Threader() {
        System.out.println("Threader created.");
    }

    public static Threader getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Threader();
                }
            }
        }
        return instance;
    }

    public void send(int packet) {
        while (!open) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        open = false;
        this.packet = packet;
        notifyAll();
    }

    public int receive() {
        while (open) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        open = true;
        notifyAll();
        return packet;
    }

}
