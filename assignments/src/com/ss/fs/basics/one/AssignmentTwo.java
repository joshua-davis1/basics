/*
    guess random number
*/

package com.ss.fs.basics.one;

import java.util.Random;
import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo util = new AssignmentTwo();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        Integer choice = null;
        int randomNum = util.getRandomNum(random);

        System.out.println("guess a number 1-100.");
        for(int i=0; i < 5; i++) {
            choice = scanner.nextInt(); // set input
            if(choice <= randomNum + 10 && choice >= randomNum - 10) {
                System.out.println(randomNum);
                return;
            } else {
                if(i!=4) {
                    System.out.println("keep guessing");
                } else {
                    System.out.println("Sorry, "+randomNum);
                }

            }
        }
    }

    int getRandomNum(Random random) {
        int num = random.nextInt(100) + 1;
        return num;
    }
}
