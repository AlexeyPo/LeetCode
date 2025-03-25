package org.example.hashmap._1_two_sum;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum twoSum;

    @BeforeEach
    void init() {
        twoSum = new TwoSum();
    }

    @AfterEach
    void destroy() {
        twoSum = null;
    }

    @Test
    void testTwoSumWhenArrayHasFourElements() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] expected = {0,1};
        int[] actual = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTwoSumWhenArrayHasThreeElements() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] expected = {1,2};
        int[] actual = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTwoSumWhenArrayHasTwoElements() {
        int[] nums = {2,3};
        int target = 5;
        int[] expected = {0,1};
        int[] actual = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
}