package org.example.array_string._26_remove_duplicates_from_aorted_array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @BeforeEach
    void setUp() {
        removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    }

    @AfterEach
    void tearDown() {
        removeDuplicatesFromSortedArray = null;
    }

    @Test
    void removeDuplicatesShouldReturnTwo() {
        int[] nums = new int[]{1, 1, 2};
        int expected = 2;
        int actual = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(expected, actual);
    }

    @Test
    void removeDuplicatesShouldReturnFive() {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int expected = 5;
        int actual = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(expected, actual);
    }
}