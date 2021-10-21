/*
    Construct a 2D array and find the max number and show its position in the array.
*/

package com.ss.fs.basics.two;

public class AssignmentTwo {
    public static void main(String[] args) {

        Integer maxNumb = null;
        int index = 0;
        Integer[] arr = {10, 20, 30, 5, 150, 4};
        maxNumb = arr[0];

        for(int i=0;i< arr.length;i++) {
            if(maxNumb < arr[i]) {
                maxNumb = arr[i];
                index = i;
            }
        }

        System.out.println("max number: "+maxNumb+"\n"+"position: "+index);
    }
}
