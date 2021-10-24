/*
    Write a program to create a deadlock between two threads.
*/

package com.ss.fs.basics.four;

import java.util.ArrayList;
import java.util.List;

public class AssignmentTwo {
    final String[] strings = {"first","second"};

    public static void main(String[] args) {

        // primitive object example
        AssignmentTwo utility = new AssignmentTwo();

        Runnable thread1 = () -> {
            System.out.println(Thread.currentThread().getName()+": attempting to access resource +"+utility.strings[0]+"+");
            try {
                synchronized (utility.strings[0]) {
                    System.out.println(Thread.currentThread().getName()+": has access +"+utility.strings[0]+"+");
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName()+": attempting to access resource +"+utility.strings[1]+"+");
                    synchronized (utility.strings[1]) {
                        System.out.println(Thread.currentThread().getName()+": has access +"+utility.strings[1]+"+");
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Runnable thread2 = () -> {
            System.out.println(Thread.currentThread().getName()+": attempting to access resource +"+utility.strings[1]+"+");
            try {
                synchronized (utility.strings[1]) {
                    System.out.println(Thread.currentThread().getName()+": has access +"+utility.strings[1]+"+");
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName()+": attempting to access resource +"+utility.strings[0]+"+");
                    synchronized (utility.strings[0]) {
                        System.out.println(Thread.currentThread().getName()+": has access +"+utility.strings[0]+"+");
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        new Thread(thread1).start();
        new Thread(thread2).start();
        System.out.println("We are deadlocked.");
    }
}
