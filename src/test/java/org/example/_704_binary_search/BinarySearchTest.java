package org.example._704_binary_search;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    BinarySearch binarySearch;

    @BeforeEach
    void init() {
        binarySearch = new BinarySearch();
    }

    @AfterEach
    void destroy() {
        binarySearch = null;
    }

    @Test
    void testShouldReturnFourAsResult() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int expected = 4;
        int actual = binarySearch.search(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void testShouldReturnMinusOneAsResult() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        int expected = -1;
        int actual = binarySearch.search(nums, target);
        assertEquals(expected, actual);
    }
}