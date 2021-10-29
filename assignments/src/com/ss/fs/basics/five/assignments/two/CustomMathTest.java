package com.ss.fs.basics.five.assignments.two;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomMathTest {
    private final CustomMath utility = new CustomMath();

    List<Integer> numbArr = new ArrayList<>();

    @Test
    public void isOddTest() {
        numbArr.add(45); numbArr.add(71); numbArr.add(94); numbArr.add(12133121);
        Object expected = "ODD"; // 45
        assertEquals(expected, utility.isOdd(numbArr.get(0)).calc());
    }
}
