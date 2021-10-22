package com.ss.fs.basics.four;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineTest {
    Line line = new Line(1,10.5,2,20.9);

    @Test
    public void slopeArithmeticTest() {
        Double expected = 10.4;
        assertEquals(expected,line.getSlope(),.0001);
    }

    @Test
    public void getArithmeticDistance() {
        Double expected = 10.4479;
        assertEquals(expected,line.getDistance(),.0001);
    }

    @Test
    public void parallelTo() {
        Boolean expected = false;
        assertEquals(expected,line.parallelTo(new Line(2,4.2,8,9.20)));
    }
}
