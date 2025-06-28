package com.junit.junit_testing;

import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise2_CalculatorTest {

    Exercise2_Calculator calc = new Exercise2_Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calc.subtract(4, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, calc.multiply(3, 4));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calc.divide(10, 0); // Should throw exception
    }
}
