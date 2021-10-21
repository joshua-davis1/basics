/*
* Take multiple values from the command line and show the result of adding all of them.
*/

package com.ss.fs.basics.two;

public class AssignmentOne {
    public static void main(String[] args) {
        int sum = 0;

        for(String a: args) {
            try {
                sum += Integer.parseInt(a);
            } catch (NumberFormatException e) {
                // has an error
            }
        }

        System.out.println(sum); // log results
    }
}
