// Given a list of strings, return a list where each string has all its "x" removed.

package com.ss.fs.basics.five.assignments.two;

import java.util.List;
import java.util.stream.Collectors;

public class PartFour {

    List<String> noX(List<String> strArr) {
        return strArr.stream().map((str) -> str.replace("x","")).collect(Collectors.toList());
    }
}
