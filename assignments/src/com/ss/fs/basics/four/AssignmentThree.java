/*
    Write a program with one thread (the producer) that produces items (in this case, simple ints).
    Another thread (the consumer) consumes items.
    For communication purposes, both threads have access to a bounded buffer which is basically an array.
*/

package com.ss.fs.basics.four;

public class AssignmentThree {

    public static void main(String[] args) {

        ProducerRunnable producerRunnable = new ProducerRunnable();
        ConsumerRunnable consumerRunnable = new ConsumerRunnable();

        Thread thread1 = new Thread(producerRunnable);

        Thread thread2 = new Thread(consumerRunnable);
        Thread thread3 = new Thread(consumerRunnable);
        Thread thread4 = new Thread(consumerRunnable);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
