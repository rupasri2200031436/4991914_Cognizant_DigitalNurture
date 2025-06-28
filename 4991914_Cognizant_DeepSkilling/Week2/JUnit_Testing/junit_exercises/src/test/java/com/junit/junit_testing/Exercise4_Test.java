package com.junit.junit_testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise4_Test {

    private Exercise4 math;
    @Before
    public void setUp() {
        System.out.println("Setting up...");
        math = new Exercise4();
    }
    @After
    public void tearDown() {
        System.out.println("Tearing down...\n");
    }

    // Test using AAA pattern: square method
    @Test
    public void testSquare() {
        int input = 4;
        int result = math.square(input);
        assertEquals(16, result);
    }

    // Test using AAA pattern: isEven method
    @Test
    public void testIsEven() {
        int number = 6;
        boolean isEven = math.isEven(number);
        assertTrue(isEven);
    }

    // Test using AAA pattern: sum method
    @Test
    public void testSum() {
        int a = 3;
        int b = 7;
        int result = math.sum(a, b);
        assertEquals(10, result);
    }
}
