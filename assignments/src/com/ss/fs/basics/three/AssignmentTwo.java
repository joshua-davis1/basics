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
        AssignmentTwo utility = new AssignmentTwo();
        Scanner scanner = new Scanner(System.in);
        StringBuilder path = new StringBuilder();

        System.out.println("Enter file to be appended.");
        path.append(scanner.next());

        utility.appendToFile(path.toString());
    }

    void appendToFile(String path) {
        // file will be made in root dir if path does not exist!
        try(
                FileWriter fw = new FileWriter(path, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw);
        ) {
            out.print("Append this to the file!");
        } catch(IOException e) {
            System.out.println("An error occurred.\n"+e);
        }
    }
}
