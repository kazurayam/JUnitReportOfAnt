package com.kazurayam;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void test_smoke() {
        String greeting = new Greeter().greet("Hana");
        assertEquals("Hello, Hana!", greeting);
    }

}
