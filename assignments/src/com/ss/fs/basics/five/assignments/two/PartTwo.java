// Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

package com.ss.fs.basics.five.assignments.two;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PartTwo {
    public static void main(String[] args) {
        PartTwo utility = new PartTwo();

        List<Integer> numbArr = new ArrayList<>();
        numbArr.add(45); numbArr.add(71); numbArr.add(94); numbArr.add(12133121);

        System.out.println(utility.rightDigit(numbArr));
    }

    List<Integer> rightDigit(List<Integer> numbList) {
        return numbList.stream().map((numb) -> numb % 10).collect(Collectors.toList());
    }
};