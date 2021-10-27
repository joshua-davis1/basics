package com.ss.fs.basics.five;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AssignmentOneTest {
    private AssignmentOne utility = new AssignmentOne();
    private List<String> unsortedList = Arrays.asList("donkey", "ball", "at", "count", "ant");

    @Test
    public void sortByLengthTest() {
        List<String> expected = Arrays.asList("at", "ant", "ball", "count", "donkey");
        assertEquals(expected,utility.sortByLength(unsortedList));
    }

    @Test
    public void sortByLengthRevEqualTest() {
        List<String> expected = Arrays.asList("donkey", "count", "ball", "ant", "at");
        assertEquals(expected,utility.sortByLengthRev(unsortedList));
    }

    @Test
    public void sortTest() {
        List<String> expected = Arrays.asList("at", "ant", "ball", "count", "donkey");
        assertEquals(expected,utility.sortByLength(unsortedList));
    }

    @Test
    public void sortByETest() {
        assertEquals(1,utility.sortByE("bear","elephant"));
    }

    @Test
    public void getATest() {
        List<String> expected = Arrays.asList("ant");
        assertEquals(expected, utility.getA(unsortedList));
    }
}
