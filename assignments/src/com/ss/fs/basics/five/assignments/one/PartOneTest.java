package com.ss.fs.basics.five.assignments.one;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PartOneTest {
    private final PartOne utility = new PartOne();
    private final List<String> unsortedList = Arrays.asList("donkey", "ball", "at", "elephant", "count", "ant");

    @Test
    public void sortByLengthTest() {
        List<String> expected = Arrays.asList("at", "ant", "ball", "count", "donkey", "elephant");
        assertEquals(expected,utility.sortByLength(unsortedList));
    }

    @Test
    public void sortByLengthRevTest() {
        List<String> expected = Arrays.asList("elephant", "donkey", "count", "ball", "ant", "at");
        assertEquals(expected,utility.sortByLengthRev(unsortedList));
    }

    @Test
    public void sortTest() {
        List<String> expected = Arrays.asList("at", "ant", "ball", "count", "donkey", "elephant");
        assertEquals(expected,utility.sort(unsortedList));
    }

    @Test
    public void sortContainsETest() {
        List<String> expected = Arrays.asList("elephant", "donkey", "ball", "at", "count", "ant");
        assertEquals(expected,utility.sortContainsE(unsortedList));
    }

    @Test
    public void sortEWithHelperTest() {
        List<String> expected = Arrays.asList("elephant", "donkey", "ball", "at", "count", "ant");
        assertEquals(expected,utility.sortEWithHelper(unsortedList));
    }

    @Test
    public void strContainsETest() {
        assertEquals(1,utility.strContainsE("bear","elephant"));
    }

    @Test
    public void prependNumbTest() {
        List<Integer> numbArr = new ArrayList<>();
        numbArr.add(45); numbArr.add(32); numbArr.add(94); numbArr.add(3);
        String expected = "o45,e32,e94,o3";
        assertEquals(expected, utility.prependNumb(numbArr));
    }

    @Test
    public void getStartsWithATest() {
        List<String> expected = Arrays.asList("ant");
        assertEquals(expected, utility.getStartsWithA(unsortedList));
    }

}
