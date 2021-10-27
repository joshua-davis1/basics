package com.ss.fs.basics.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AssignmentOne {
    public static void main(String[] args) {
        AssignmentOne stringApi = new AssignmentOne();
        List<String> someStrings = Arrays.asList("python", "a", "fu","energy", "tea", "bent","bar", "empty");
        List<Integer> someNumbs = Arrays.asList(1,2,3,4,5);

        //1d
        // Strings that contain “e” first, everything else second.
        // For now, put the code directly in the lambda.
//        someStrings.stream().sorted((s1,s2) -> {
//            if(s1.charAt(0) == 'e' && s2.charAt(0) == 'e'){
//            return 0;
//        }
//        if(s1.charAt(0) == 'e') {
//            return -1;
//        }
//        return 1;
//        }).collect(Collectors.toList());

        // Redo the previous problem, but use a static helper method so that your lambda looks like this:
        // Arrays.sort(words, (s1,s2) -> Utils.yourMethod(s1,s2))

        // someStrings.stream().sorted(stringApi::sortByE).collect(Collectors.toList())
        //System.out.println(someStrings.stream().sorted((s1,s2) -> stringApi.sortByE(s1,s2)).collect(Collectors.toList()));


        // 2
        // Using Java 8 features write a method that returns a comma separated string based on a given list of integers.
        // Each element should be preceded by the letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd.
        // For example, if the input list is (3,44), the output should be 'o3,e44'.
        StringBuffer result = new StringBuffer();
        String blah = someNumbs.stream().map((numb) -> {
            if (numb%2 == 0) {
                return "e"+numb;
            } else {
                return "o"+numb;
            }
        }).collect(Collectors.joining(","));

        System.out.println(blah);
    }

    // 1a
    // length (i.e., shortest to longest)
    List<String> sortByLength(List<String> arr) {
        return arr.stream().sorted((s1,s2) -> s1.length() - s2.length()).collect(Collectors.toList());
    }

    // 1b
    // length (i.e., shortest to longest)
    List<String> sortByLengthRev(List<String> arr) {
        return arr.stream().sorted((s1,s2) -> s2.length() - s1.length()).collect(Collectors.toList());
    }

    // 1c
    // alphabetically by the first character only
    List<String> sort(List<String> arr) {
        return arr.stream().sorted((s1,s2) -> s1.charAt(0) - s2.charAt(0)).collect(Collectors.toList());
    }

    // 1e
    // static helper method
    int sortByE(String s1, String s2) {
        if(s1.charAt(0) == 'e' && s2.charAt(0) == 'e'){
            return 0;
        }
        if(s1.charAt(0) == 'e') {
            return -1;
        }
        return 1;
    }

    // 3
    List<String> getA(List<String> stringList){
        return stringList.stream().filter((str) -> str.charAt(0) == 'a' && str.length() == 3).collect(Collectors.toList());
    }
}

