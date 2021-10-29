// Given a list of strings, return a list where each string has all its "x" removed.

package com.ss.fs.basics.five.assignments.two;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PartFour {

    public static void main(String[] args) {
        PartFour utility = new PartFour();

        List<String> numbArr = new ArrayList<>();
        numbArr.add("extraxX"); numbArr.add("animal"); numbArr.add("exit"); numbArr.add("extends"); numbArr.add("null");

        System.out.println(utility.noX(numbArr));
    }

    List<String> noX(List<String> strArr) {
        return strArr.stream().map((str) -> str.replace("x","")).collect(Collectors.toList());
    }
}
