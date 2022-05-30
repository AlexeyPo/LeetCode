package org.example._1281_subtract_the_product_and_sum_of_digits_of_an_integer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractProductAndSumOfDigitsOfIntegerTest {

    SubtractProductAndSumOfDigitsOfInteger subtractProductAndSumOfDigitsOfInteger;

    @BeforeEach
    void init() {
        subtractProductAndSumOfDigitsOfInteger = new SubtractProductAndSumOfDigitsOfInteger();
    }

    @AfterEach
    void destroy() {
        subtractProductAndSumOfDigitsOfInteger = null;
    }

    @Test
    void subtractProductAndSumShouldReturnFifteen() {
        int n = 234;
        int expected = 15;
        int actual = subtractProductAndSumOfDigitsOfInteger.subtractProductAndSum(n);
        assertEquals(expected, actual);
    }

    @Test
    void subtractProductAndSumShouldReturnTwentyOne() {
        int n = 4421;
        int expected = 21;
        int actual = subtractProductAndSumOfDigitsOfInteger.subtractProductAndSum(n);
        assertEquals(expected, actual);
    }

    @Test
    void subtractProductAndSumShouldReturnFifteenSecondVariant() {
        int n = 234;
        int expected = 15;
        int actual = subtractProductAndSumOfDigitsOfInteger.subtractProductAndSumSecondVariant(n);
        assertEquals(expected, actual);
    }

    @Test
    void subtractProductAndSumShouldReturnTwentyOneSecondVariant() {
        int n = 4421;
        int expected = 21;
        int actual = subtractProductAndSumOfDigitsOfInteger.subtractProductAndSumSecondVariant(n);
        assertEquals(expected, actual);
    }
}