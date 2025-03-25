package org.example._66_plus_one;

import org.example.math._66_plus_one.Solution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @AfterEach
    void destroy() {
        solution = null;
    }

    @Test
    void testPlusOne() {
        int[] digits = {1,2,3};
        int[] actual = solution.plusOne(digits);
        int[] expected = {1,2,4};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testShouldReturnArrayWithTheSameNumbersOfElements() {
        int[] digits = {4,3,2,1};
        int[] actual = solution.plusOne(digits);
        int[] expected = {4,3,2,2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testShouldReturnArrayIncreasedOneElement() {
        int[] digits = {0};
        int[] actual = solution.plusOne(digits);
        int[] expected = {1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testShouldReturnArrayWithTwoElements() {
        int[] digits = {9};
        int[] actual = solution.plusOne(digits);
        int[] expected = {1,0};
        assertArrayEquals(expected, actual);
    }


}