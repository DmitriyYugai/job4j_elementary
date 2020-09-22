package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenp4k1ThenSquare1() {
        double expected = 1.0;
        int p = 4;
        int k = 1;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenp6k2ThenSquare2() {
        double expected = 2.0;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}