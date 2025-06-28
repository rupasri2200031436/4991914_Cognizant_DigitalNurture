package com.junit.junit_testing;
import org.junit.Test;
import static org.junit.Assert.*;
public class Exercise3_AssertionTest {

    @Test
    public void testAssertions() {
        assertEquals(5, 2 + 3); 

        assertTrue(5 > 3); 

        assertFalse(5 < 3); 

        Object obj1 = null;
        assertNull(obj1);

        Object obj2 = new Object();
        assertNotNull(obj2); 
    }
}

