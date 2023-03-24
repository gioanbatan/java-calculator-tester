package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void floatAdd() {
        assertEquals(10.0, Calculator.floatAdd(5.0F, 5.0F), "Method floatAdd have a problem");
    }

    @Test
    void floatSubstract() {
        assertEquals(10.0, Calculator.floatSubstract(20.0F, 10.0F), "Method floatSubstract have a problem");
    }

    @Test
    void floatDivide() {
        assertThrows(IllegalArgumentException.class,
                () -> Calculator.floatDivide(10.0f, 0));
        assertEquals(5.0, Calculator.floatDivide(10.0F, 2.0F), "Method floatDivide have a problem");
    }

    @Test
    void floatMultiply() {
        assertEquals(50.0, Calculator.floatMultiply(10.0F, 5.0F), "Method floatMultiply have a problem");
    }
}