package com.ss.fs.basics.four;

import java.util.List;

public class RunnableClass implements Runnable {
    final private List<Person> people;
    final private int SLEEP;

    public RunnableClass(List<Person> people, int SLEEP) {
        this.people = people;
        this.SLEEP = SLEEP;
    }

    // loop through and lock each resource for given ms (SLEEP)
    @Override
    public void run() {
        people.forEach((person) -> {
            System.out.println(Thread.currentThread().getName()+": attempting to access resource +"+person.getName()+"+");
            try {
                synchronized (person) {
                    System.out.println(Thread.currentThread().getName()+": has access "+person);
                    Thread.sleep(SLEEP);
                }
            } catch(InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+" error occurred executing +"+person.getName()+"+");
            }
        });
    }
}
