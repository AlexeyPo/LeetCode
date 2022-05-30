package org.example._191_number_of_one_bits;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfOneBitsTest {

    NumberOfOneBits numberOfOneBits;

    @BeforeEach
    void init() {
        numberOfOneBits = new NumberOfOneBits();
    }

    @AfterEach
    void destroy() {
        numberOfOneBits = null;
    }

    @Test
    void hammingWeightShouldReturnOne() {
        int n = 00000000000000000000000010000000;
        int expected = 1;
        int actual = numberOfOneBits.hammingWeight(n);
        assertEquals(expected, actual);
    }

    @Test
    void hammingWeightShouldReturnThree() {
        int n = 00000000000000000000000000001011;
        int expected = 3;
        int actual = numberOfOneBits.hammingWeight(n);
        assertEquals(expected, actual);
    }
}