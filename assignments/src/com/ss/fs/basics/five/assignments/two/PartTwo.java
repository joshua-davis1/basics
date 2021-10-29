// Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

package com.ss.fs.basics.five.assignments.two;

import java.util.List;
import java.util.stream.Collectors;

public class PartTwo {

    List<Integer> rightDigit(List<Integer> numbList) {
        return numbList.stream().map((numb) -> numb % 10).collect(Collectors.toList());
    }
};