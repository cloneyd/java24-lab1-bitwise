package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitwiseMultiplierTest {

    @Test
    void multiplyPositiveNumbers() {
        assertEquals(12, BitwiseMultiplier.multiply(3, 4));
        assertEquals(16, BitwiseMultiplier.multiply(4, 4));
        assertEquals(1024, BitwiseMultiplier.multiply(16, 64));
    }

    @Test
    void multiplyNegativeNumbers() {
        assertEquals(-12, BitwiseMultiplier.multiply(-3, 4));
        assertEquals(-16, BitwiseMultiplier.multiply(4, -4));
        assertEquals(1024, BitwiseMultiplier.multiply(-16, -64));
    }

    @Test
    void multiplyZero() {
        assertEquals(0, BitwiseMultiplier.multiply(0, 4));
        assertEquals(0, BitwiseMultiplier.multiply(4, 0));
        assertEquals(0, BitwiseMultiplier.multiply(-4, 0));
    }

    @Test
    void multiplyMaxValues() {
        assertEquals(Long.MAX_VALUE, BitwiseMultiplier.multiply(Long.MAX_VALUE, 1));
        assertEquals(Long.MAX_VALUE, BitwiseMultiplier.multiply(1, Long.MAX_VALUE));
        assertEquals(0, BitwiseMultiplier.multiply(0, Long.MAX_VALUE));
    }

    @Test
    void sumPositiveNumbers() {
        assertEquals(7, BitwiseMultiplier.sum(3, 4));
        assertEquals(8, BitwiseMultiplier.sum(4, 4));
        assertEquals(80, BitwiseMultiplier.sum(16, 64));
    }

    @Test
    void sumNegativeNumbers() {
        assertEquals(-7, BitwiseMultiplier.sum(-3, -4));
        assertEquals(0, BitwiseMultiplier.sum(-4, 4));
        assertEquals(-80, BitwiseMultiplier.sum(-16, -64));
    }

    @Test
    void sumZero() {
        assertEquals(3, BitwiseMultiplier.sum(3, 0));
        assertEquals(4, BitwiseMultiplier.sum(0, 4));
        assertEquals(-4, BitwiseMultiplier.sum(-4, 0));
    }

    @Test
    void sumMaxValues() {
        assertEquals(Long.MIN_VALUE, BitwiseMultiplier.sum(Long.MAX_VALUE, 1));
        assertEquals(Long.MIN_VALUE, BitwiseMultiplier.sum(1, Long.MAX_VALUE));
        assertEquals(Long.MAX_VALUE, BitwiseMultiplier.sum(0, Long.MAX_VALUE));
    }
}