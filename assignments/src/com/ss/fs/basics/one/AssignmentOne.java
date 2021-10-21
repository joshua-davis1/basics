/*
* print pattern
*/

package com.ss.fs.basics.one;

public class AssignmentOne {
    public static void main(String[] args) {
        String[] pattern1 = {"*","**","***","****","..........."};
        // first pattern
        System.out.println("1)");
        for(int i=0; i<pattern1.length; i++){
            System.out.println(pattern1[i]);
        }
        // inverted pattern
        System.out.println("2)");
        for(int i=pattern1.length; i > 0; i--) {
            System.out.println(pattern1[i-1]);
        }
        // second pattern
        String[] pattern2 = {"     *","    ***","   *****","  *******","..........."};
        System.out.println("3)");
        for(int i=0; i<pattern1.length; i++){
            System.out.println(pattern2[i]);
        }
        // inverted pattern
        System.out.println("4)");
        for(int i=pattern1.length; i > 0; i--) {
            System.out.println(pattern2[i-1]);
        }
    }
}
