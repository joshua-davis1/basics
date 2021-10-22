/*
    Thread safe singleton
    Implement a Singleton with double checked locking.
*/

package com.ss.fs.basics.four;

public class AssignmentOne {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.getSomeText());
        System.out.println(singleton2.getSomeText());
        singleton1.setSomeText("Here's our new text!");
        System.out.println(singleton1.getSomeText());
        System.out.println(singleton2.getSomeText());
    }
}
