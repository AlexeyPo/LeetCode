package org.example._268_missing_number;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    MissingNumber missingNumber;

    @BeforeEach
    void init() {
        missingNumber = new MissingNumber();
    }

    @AfterEach
    void destroy() {
        missingNumber = null;
    }

    @Test
    void missingNumberShouldReturnTwo() {
        int[] nums = {3,0,1};
        int expected = 2;
        int actual = missingNumber.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void missingNumberShouldReturnTwoSecondExample() {
        int[] nums = {0,1};
        int expected = 2;
        int actual = missingNumber.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void missingNumberShouldReturnEight() {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int expected = 8;
        int actual = missingNumber.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void missingNumberShouldReturnZero() {
        int[] nums = {1};
        int expected = 0;
        int actual = missingNumber.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void missingNumberShouldReturnZeroSecondExample() {
        int[] nums = {2,1};
        int expected = 0;
        int actual = missingNumber.missingNumber(nums);
        assertEquals(expected, actual);
    }
}