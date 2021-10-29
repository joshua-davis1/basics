package com.ss.fs.basics.five.assignments.two;

public class CustomMath {

    public PerformOperation isOdd(Integer numb) {
        return () -> (numb % 2 == 0)? "EVEN":"ODD";
    }

    public PerformOperation isPrime(Integer numb) {
        return () -> {
            if (numb == 2 || numb == 3 || numb == 5 || numb == 7) {
                return "PRIME";
            }
            for (int i=2; i < 9; i++) {
                if (numb % i == 0) {
                    return "COMPOSITE";
                }
            }
            return "PRIME";
        };
    }

    public PerformOperation isPalindrome(Integer numb) {
        return () -> {
            if (numb ==  0) {
                return "PALINDROME";
            }

            if (numb < 0 || numb % 10 == 0) {
                return "NOT PALINDROME";
            }
            StringBuilder numbString = new StringBuilder();
            numbString.append(numb);
            if (numbString.toString().equals(numbString.reverse().toString())) {
                return "PALINDROME";
            }
            return "NOT PALINDROME";
        };

    }

}
