package com.ss.fs.basics.four;

import java.util.PriorityQueue;

public class Threader {
    volatile public static Threader instance = null;
    private final PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

    private Threader() {
        System.out.println("\nThreader has been initiated!");
    }

    public PriorityQueue<Integer> getQueue() {
        return queue;
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
