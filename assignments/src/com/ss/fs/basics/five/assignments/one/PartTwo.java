package com.ss.fs.basics.five.assignments.one;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class PartTwo {
    // 1.
    // LocalDateTime

    // 2.
    // find previous thursday
    LocalDate findLastThursday(LocalDate now) {
        int currentDay = now.getDayOfWeek().getValue();
        return switch (currentDay) {
            case 1 -> now.minusDays(4);
            case 2 -> now.minusDays(5);
            case 3 -> now.minusDays(6);
            case 4 -> now.minusDays(7);
            case 5 -> now.minusDays(1);
            case 6 -> now.minusDays(2);
            case 7 -> now.minusDays(3);
            default -> now;
        };
    }

    // 3.
    // ZoneId is a rule-set or time-zone and ZoneOffset is the amount of time that a time-zone differs from Greenwich/UTC.
    ZoneOffset getZoneOffset(String timezone) {
        ZoneId myZone = ZoneId.of(timezone);
        return ZoneOffset.from(ZonedDateTime.now(myZone));
    }

    // 4.
    //    a. ZonedDateTime.now()
    //    b. call toInstant() on the ZonedDateTime instance you want to convert.

    // 5.
    List<Integer> getDaysInMonth(int year) {
        ArrayList<Integer> monthList = new ArrayList<>();
        LocalDate selectedYear = LocalDate.of(year,1,1);
        for (int i=0;i<12;i++) {
            monthList.add(selectedYear.plusMonths(i).lengthOfMonth());
        }
        return monthList;
    }

    // 6.
    // Write an example that, for a given month of the current year, lists all of the Mondays in that month.
    List<LocalDate> listAllMondays(int month) {
        LocalDate range = LocalDate.of(2021,month,1);
        List<LocalDate> results = new ArrayList<>();

        for (int i=0; i<range.lengthOfMonth(); i++) {
            LocalDate day = range.plusDays(i);
            if (day.getDayOfWeek().getValue() == 1) results.add(day);
        }
        return results;
    }

    // 7.
    // Write an example that tests whether a given date occurs on Friday the 13th.
    Boolean isAScaryDay(LocalDate day) {
        if(day.getDayOfWeek().getValue() != 5) return Boolean.FALSE;
        if(day.getDayOfMonth() != 13) return Boolean.FALSE;
        return Boolean.TRUE;
    }
}
