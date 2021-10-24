/*
    Write a program to create a deadlock between two threads.
*/

package com.ss.fs.basics.four;

public class AssignmentTwo {
    final String[] strings = {"first","second"};

    public static void main(String[] args) {

        AssignmentTwo utility = new AssignmentTwo();

        Runnable thread1 = () -> utility.myRunnableConsumer(0,1);
        Runnable thread2 = () -> utility.myRunnableConsumer(1,0);

        new Thread(thread1).start();
        new Thread(thread2).start();
        System.out.println("We are deadlocked.");
    }

    void myRunnableConsumer(int i, int j) {
        System.out.println(Thread.currentThread().getName()+": attempting to access resource +"+strings[i]+"+");
        try {
            synchronized (strings[i]) {
                System.out.println(Thread.currentThread().getName()+": consumed +"+strings[i]+"+");
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+": attempting to access resource +"+strings[j]+"+");
                synchronized (strings[j]) {
                    System.out.println(Thread.currentThread().getName()+": has consumed +"+strings[j]+"+");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
