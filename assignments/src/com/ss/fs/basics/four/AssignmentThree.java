/*
    Write a program with one thread (the producer) that produces items (in this case, simple ints).
    Another thread (the consumer) consumes items.
    For communication purposes, both threads have access to a bounded buffer which is basically an array.
*/

package com.ss.fs.basics.four;

public class AssignmentThree {

    public static void main(String[] args) {
        Threader threader = Threader.getInstance();

        Thread thread1 = new Thread(new ProducerRunnable(threader));
        Thread thread2 = new Thread(new ConsumerRunnable(threader));

        thread1.start();
        thread2.start();

    }
}
