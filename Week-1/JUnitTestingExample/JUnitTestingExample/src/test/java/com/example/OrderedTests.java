package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
public class OrderedTests {

    Calculator calculator = new Calculator();

    @Test
    @Order(1)
    void testAdd() {
        System.out.println("Running Addition Test");
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @Order(2)
    void testSubtract() {
        System.out.println("Running Subtraction Test");
        assertEquals(4, calculator.subtract(10, 6));
    }

    @Test
    @Order(3)
    void testMultiply() {
        System.out.println("Running Multiplication Test");
        assertEquals(20, calculator.multiply(4, 5));
    }
}