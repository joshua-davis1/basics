/*
    Write a Java program that counts the number of times a particular character, such as 'e', appears in a file.
    The character can be specified at the command line.
*/

package com.ss.fs.basics.three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssignmentThree {
    public static void main(String[] args) {
        AssignmentThree utility = new AssignmentThree();
        File file = new File("someFile.txt");

        int count = 0;

        char queryChar = args[0].charAt(0);

        count = utility.scanFile(count,file,queryChar);

        System.out.println("count: "+count);
    }
    int scanFile(int count,File file,char queryChar) {
        try(Scanner sFile = new Scanner(file)) {
            while(sFile.hasNextLine()) {
                String data = sFile.nextLine();
                for(int i=0;i<data.length();i++){
                    if(data.charAt(i) == queryChar) {
                        count++;
                    }
                }
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            return count;
        }
    }
}
