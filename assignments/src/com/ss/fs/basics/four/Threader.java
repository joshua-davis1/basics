package com.ss.fs.basics.four;

public class Threader {
    volatile public static Threader instance = null;
    private final Integer[] dataStream = new Integer[5];

    private Threader() {
        System.out.println("Threader has been initiated!");
    }

    public Integer[] getDataStream() {
        return dataStream;
    }

    void setPacket(Integer packet, int index) {
        dataStream[index] = packet;
    }

    public static Threader getInstance() {
        if (instance == null) {
            synchronized (Threader.class) {
                if (instance == null) {
                    instance = new Threader();
                }
            }
        }
        return instance;
    }
}
