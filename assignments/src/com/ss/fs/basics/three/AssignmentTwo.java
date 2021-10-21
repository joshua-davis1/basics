/*
    Write a Java program to append text to an existing file.
*/

package com.ss.fs.basics.three;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = null;

        System.out.println("Enter file to be appended.");
        fileName = scanner.next();

        // file will be made in root dir if path does not exist!
        try(
                FileWriter fw = new FileWriter(fileName, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw);
        ) {
            out.print("Append this to the file!");
        } catch(IOException e) {
            System.out.println("An error occurred.\n"+e);
        }
    }
}
