package com.kazurayam;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void test_add() {
        int expected = 5;
        int actual = Calculator.add(1, 2);
        assertEquals(expected, actual);
    }
}
