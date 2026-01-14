package org.example.array_string._13_roman_to_integer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    RomanToInteger romanToInteger;

    @BeforeEach
    void init() {
        romanToInteger = new RomanToInteger();
    }

    @AfterEach
    void destroy() {
        romanToInteger = null;
    }

    @Test
    void romanToIntShouldReturnThree() {
        String s = "III";
        int expected = 3;
        int actual = romanToInteger.romanToInt(s);
        assertEquals(expected, actual);
    }

    @Test
    void romanToIntShouldReturnFiftyEight() {
        String s = "LVIII";
        int expected = 58;
        int actual = romanToInteger.romanToInt(s);
        assertEquals(expected, actual);
    }

    @Test
    void romanToIntShouldReturnOneThousandNineHundredNinetyFour() {
        String s = "MCMXCIV";
        int expected = 1994;
        int actual = romanToInteger.romanToInt(s);
        assertEquals(expected, actual);
    }
}