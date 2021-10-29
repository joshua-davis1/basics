package com.ss.fs.basics.five.assignments.two;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AssignmentTwoTest {

    PartTwo partTwo = new PartTwo();
    PartThree partThree = new PartThree();
    PartFour partFour = new PartFour();
    PartFive partFive = new PartFive();

    List<Integer> numbArr = new ArrayList<>() {{add(545);add(71);add(94);add(191);}};

    @Test
    public void rightDigitTest() {
        List<Integer> expected = new ArrayList<>() {{add(5);add(1);add(4);add(1);}};

        assertEquals(expected, partTwo.rightDigit(numbArr));
    }

    @Test
    public void doublingTest() {
        List<Integer> expected = new ArrayList<>() {{add(1090);add(142);add(188);add(382);}};

        assertEquals(expected, partThree.doubling(numbArr));
    }

    @Test
    public void noXTest() {
        List<String> stringArr = new ArrayList<>(){{add("extraxX");add("animal");add("exit");add("extends");add("null");}};

        List<String> expected = new ArrayList<>(){{add("etraX");add("animal");add("eit");add("etends");add("null");}};

        assertEquals(expected, partFour.noX(stringArr));
    }

    @Test
    public void groupSumClumpFalseTest() {
        int[] testCase = {2,4,4,8};

        Boolean expected = false;

        assertEquals(expected, partFive.groupSumClump(0,testCase, 14));
    }

    @Test
    public void groupSumClumpTrueTest() {
        int[] testCase = {2,4,4,8};

        Boolean expected = true;

        assertEquals(expected, partFive.groupSumClump(0,testCase, 10));
    }

}
