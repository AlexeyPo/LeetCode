package org.example.math._50_pow_x_n;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowXToNTest {

    PowXToN powXToN;

    @BeforeEach
    void setUp() {
        powXToN = new PowXToN();
    }

    @AfterEach
    void tearDown() {
        powXToN = null;
    }

    @Test
    void myPowShouldReturnOneThousandAndTwentyFour() {
        double x = 2;
        int n = 10;
        double expected = 1024;
        double actual = powXToN.myPow(x, n);
        assertEquals(expected,actual, 0.000001);
    }

    @Test
    void myPowShouldReturnNinePointTwoSixOne() {
        double x = 2.1;
        int n = 3;
        double expected = 9.261;
        double actual = powXToN.myPow(x, n);
        assertEquals(expected,actual, 0.000001);
    }

    @Test
    void myPowShouldReturnZeroPointTwoFive() {
        double x = 2;
        int n = -2;
        double expected = 0.25;
        double actual = powXToN.myPow(x, n);
        assertEquals(expected,actual, 0.000001);
    }
}