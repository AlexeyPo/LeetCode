package org.example._69_sqrt;

import org.example.math._69_sqrt.Sqrt;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    Sqrt sqrt;

    @BeforeEach
    void setUp() {
        sqrt = new Sqrt();
    }

    @AfterEach
    void tearDown() {
        sqrt = null;
    }

    @Test
    void mySqrtShouldReturnSquareRootOfFour() {
        int x = 4;
        int expected = 2;
        int actual = sqrt.mySqrt(x);
        assertEquals(expected, actual);
    }

    @Test
    void mySqrtShouldReturnSquareRootOfEight() {
        int x = 8;
        int expected = 2;
        int actual = sqrt.mySqrt(x);
        assertEquals(expected, actual);
    }
}