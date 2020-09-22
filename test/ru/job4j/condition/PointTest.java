package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when16to23then2() {
        double expected = 3.16;
        int x1 = 1;
        int y1 = 6;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus102to610then2() {
        double expected = 17.88;
        int x1 = -10;
        int y1 = 2;
        int x2 = 6;
        int y2 = 10;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}