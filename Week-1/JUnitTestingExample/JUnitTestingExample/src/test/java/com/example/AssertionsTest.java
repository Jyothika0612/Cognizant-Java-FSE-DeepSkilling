package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        // Assert Equals
        assertEquals(5, 2 + 3);

        // Assert True
        assertTrue(10 > 5);

        // Assert False
        assertFalse(5 > 10);

        // Assert Null
        String name = null;
        assertNull(name);

        // Assert Not Null
        Calculator c = new Calculator();
        assertNotNull(c);
    }
}