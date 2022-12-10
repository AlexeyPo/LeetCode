package org.example._371_sum_of_two_integers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoIntegersTest {

    SumOfTwoIntegers sumOfTwoIntegers;

    @BeforeEach
    void setUp() {
        sumOfTwoIntegers = new SumOfTwoIntegers();
    }

    @AfterEach
    void tearDown() {
        sumOfTwoIntegers = null;
    }

    @Test
    void getSumShouldReturnThree() {
        int a = 1;
        int b = 2;
        int expected = 3;

        int actual = sumOfTwoIntegers.getSum(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void getSumShouldReturnFive() {
        int a = 2;
        int b = 3;
        int expected = 5;

        int actual = sumOfTwoIntegers.getSum(a, b);
        assertEquals(expected, actual);
    }
}