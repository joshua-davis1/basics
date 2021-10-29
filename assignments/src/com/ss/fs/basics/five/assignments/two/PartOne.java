package com.ss.fs.basics.five.assignments.two;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PartOne{

    public static void main(String[] args) {
        CustomMath mathUtils = new CustomMath();

        List<Integer> numbArr = new ArrayList<>();
        numbArr.add(45); numbArr.add(71); numbArr.add(94); numbArr.add(12133121);

        // is odd
        System.out.println(numbArr.stream().map(numb -> mathUtils.isOdd(numb).calc()).collect(Collectors.toList()));

        // is prime
        System.out.println(numbArr.stream().map(numb -> mathUtils.isPrime(numb).calc()).collect(Collectors.toList()));

        // is Palindrome
        System.out.println(numbArr.stream().map(numb -> mathUtils.isPalindrome(numb).calc()).collect(Collectors.toList()));
    }



}
