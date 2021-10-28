package com.ss.fs.basics.five.assignments.one;

import org.junit.Test;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PartTwoTest {
    PartTwo utility = new PartTwo();

    @Test
    public void findLastThursdayTest() {
        LocalDate day = LocalDate.of(2021,10,26);
        LocalDate expected = LocalDate.of(2021,10,21);

        assertEquals(expected, utility.findLastThursday(day));
    }

    @Test
    public void getZoneOffsetTest() {
        ZoneOffset expected = ZoneOffset.ofHours(-4);
        assertEquals(expected, utility.getZoneOffset("America/New_York"));
    }

    @Test
    public void getDaysInMonth() {
        Integer[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        List<Integer> expected = new ArrayList<>();

        Collections.addAll(expected, months);

        assertEquals(expected, utility.getDaysInMonth(2000));
    }

    @Test
    public void listAllMondaysTest() {
        List<LocalDate> expected = new ArrayList<>();

        expected.add(LocalDate.of(2021,5,3));
        expected.add(LocalDate.of(2021,5,10));
        expected.add(LocalDate.of(2021,5,17));
        expected.add(LocalDate.of(2021,5,24));
        expected.add(LocalDate.of(2021,5,31));

        assertEquals(expected, utility.listAllMondays(5));
    }

    @Test
    public void isAScaryDayTest() {
        Boolean expected = false;

        assertEquals(expected, utility.isAScaryDay(LocalDate.now()));
    }
}
