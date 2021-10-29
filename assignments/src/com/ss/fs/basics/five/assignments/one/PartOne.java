package com.ss.fs.basics.five.assignments.one;

import java.util.List;
import java.util.stream.Collectors;

public class PartOne {
    // 1a
    List<String> sortByLength(List<String> arr) {
        return arr.stream().sorted((s1,s2) -> s1.length() - s2.length()).collect(Collectors.toList());
    }

    // 1b
    List<String> sortByLengthRev(List<String> arr) {
        return arr.stream().sorted((s1,s2) -> s2.length() - s1.length()).collect(Collectors.toList());
    }

    // 1c
    List<String> sort(List<String> arr) {
        return arr.stream().sorted((s1,s2) -> s1.charAt(0) - s2.charAt(0)).collect(Collectors.toList());
    }

    // 1d
    List<String> sortContainsE(List<String> arr) {
        return arr.stream().sorted((s1,s2) -> {
            if(s1.charAt(0) == 'e' && s2.charAt(0) == 'e') return 0;
            if(s1.contains("e")) return -1;
            return 1;
            }).collect(Collectors.toList());
    }

    // 1e
    List<String> sortEWithHelper(List<String> arr) {
        // arr.stream().sorted((s1, s2) -> strContainsE(s1, s2)).collect(Collectors.toList());
        // method reference
        return arr.stream().sorted(this::strContainsE).collect(Collectors.toList());
    }

    // 1e static helper method
    int strContainsE(String s1, String s2) {
        if(s1.charAt(0) == 'e' && s2.charAt(0) == 'e') return 0;
        if(s1.charAt(0) == 'e') return -1;
        return 1;
    }

    // 2
    String prependNumb(List<Integer> arr) {
        return arr.stream().map((numb) -> {
            if (numb%2 == 0) return "e"+numb;
            else return "o"+numb;
        }).collect(Collectors.joining(","));
    }

    // 3
    List<String> getStartsWithA(List<String> stringList){
        return stringList.stream().filter((str) -> str.charAt(0) == 'a' && str.length() == 3).collect(Collectors.toList());
    }
}
