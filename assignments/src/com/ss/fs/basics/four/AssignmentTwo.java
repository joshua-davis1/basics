/*
    Write a program to create a deadlock between two threads.
*/

package com.ss.fs.basics.four;

import java.util.ArrayList;
import java.util.List;

public class AssignmentTwo {
    public static void main(String[] args) {
        Person Bob = new Person("Bob",54,234234892);
        Person Sara = new Person("Sara",45,849372723);

        List<Person> group1 = new ArrayList<>();
        List<Person> group2 = new ArrayList<>();

        group1.add(Bob);
        group1.add(Sara);
        group2.add(Sara);
        group2.add(Bob);

        Runnable myRunnable1 = new RunnableClass(group1,1000000);
        Runnable myRunnable2 = new RunnableClass(group2,500);

        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

        System.out.println("Starting thread one.");
        thread1.start();
        System.out.println("Starting thread two.");
        thread2.start();

        // deadlock until thread1 awakes
        System.out.println("We are in a deadlock!");

    }
}
