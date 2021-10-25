/*
    Write a Java program to get a list of all file/directory names (including in subdirectories) under a given directory.
*/

package com.ss.fs.basics.three;

import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder path = new StringBuilder();
        NodeCrawler nodeCrawler = new NodeCrawler();

        System.out.println("Enter directory path: ");
        path.append(scanner.next());

        nodeCrawler.setPath(path);
        nodeCrawler.printNodes();

    }
}
