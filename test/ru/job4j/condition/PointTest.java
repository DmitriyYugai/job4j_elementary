package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when16to23then2() {
        double expected = 3.16;
        Point a = new Point(1, 6);
        Point b = new Point(2, 3);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus102to610then2() {
        double expected = 17.88;
        Point a = new Point(-10, 2);
        Point b = new Point(6, 10);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }
}