package org.example._136_single_number;

import org.example.bit_manipulation._136_single_number.SingleNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    SingleNumber singleNumber;

    @BeforeEach
    void init() {
        singleNumber = new SingleNumber();
    }

    @AfterEach
    void destroy() {
        singleNumber = null;
    }

    @Test
    void testSingleNumberWithThreeElementsArray() {
        int[] nums = {2,2,1};
        int expected = 1;
        int actual = singleNumber.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleNumberWithFiveElementsArray() {
        int[] nums = {4,1,2,1,2};
        int expected = 4;
        int actual = singleNumber.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleNumberWithOneElementArray() {
        int[] nums = {3};
        int expected = 3;
        int actual = singleNumber.singleNumber(nums);
        assertEquals(expected, actual);
    }

}
