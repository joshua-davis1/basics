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
            try {
                synchronized (person) {
                    System.out.println(Thread.currentThread().getName()+" executing +"+person.getName()+"+");
                    Thread.sleep(SLEEP);
                }
            } catch(InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+" error occurred executing +"+person.getName()+"+");
            }
        });
    }
}
