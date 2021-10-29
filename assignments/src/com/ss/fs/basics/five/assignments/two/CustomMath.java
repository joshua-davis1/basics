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

    // TODO: a more efficient solution would be to test one half against the other half
    public PerformOperation isPalindrome(Integer numb) {
        return () -> {
            if (numb ==  0) {
                return "PALINDROME";
            }

            // negative numbers and any number that ends with 0 is not a palindrome
            if (numb < 0 || numb % 10 == 0) {
                return "NOT PALINDROME";
            }
            StringBuilder numbString = new StringBuilder();
            numbString.append(numb);
            if (numb.toString().equals(numbString.reverse().toString())) {
                return "PALINDROME";
            }
            return "NOT PALINDROME";
        };

    }

}
