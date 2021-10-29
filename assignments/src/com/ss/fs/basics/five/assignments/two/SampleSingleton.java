package com.ss.fs.basics.five.assignments.two;

import java.sql.Connection;

public class SampleSingleton {
    private static Connection conn = null;

    volatile private static SampleSingleton instance = null;

    private SampleSingleton() {
        System.out.println("singleton has been initiated.");
    }

    public static SampleSingleton getInstance() {
        if (instance == null) {
            synchronized (SampleSingleton.class) {
                if (instance == null) {
                    instance = new SampleSingleton();
                }
            }
        }
        return instance;
    }

}
