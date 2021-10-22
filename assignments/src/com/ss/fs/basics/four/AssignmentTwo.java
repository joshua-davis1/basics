/*
    Write a program to create a deadlock between two threads.
*/

package com.ss.fs.basics.four;

import java.util.ArrayList;
import java.util.List;

public class AssignmentTwo {
    final String[] strings = {"first","second"};

    public static void main(String[] args) {
//        Person Bob = new Person("Bob",54,234234892);
//        Person Sara = new Person("Sara",45,849372723);
//
//        List<Person> group1 = new ArrayList<>();
//        List<Person> group2 = new ArrayList<>();
//
//        group1.add(Bob);
//        group1.add(Sara);
//        group2.add(Sara);
//        group2.add(Bob);
//
//        Runnable myRunnable1 = new RunnableClass(group1,1000000 );
//        Runnable myRunnable2 = new RunnableClass(group2,500);
//
//        Thread thread1 = new Thread(myRunnable1);
//        Thread thread2 = new Thread(myRunnable2);
//
//        System.out.println("Starting thread one.");
//        thread1.start();
//        System.out.println("Starting thread two.");
//        thread2.start();
//
//        // deadlock until thread1 awakes
//        System.out.println("We are in a deadlock!");

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
