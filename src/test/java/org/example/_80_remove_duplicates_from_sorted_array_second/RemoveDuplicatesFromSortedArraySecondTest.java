package org.example._80_remove_duplicates_from_sorted_array_second;

import org.example.array_string._80_remove_duplicates_from_sorted_array_second.RemoveDuplicatesFromSortedArraySecond;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArraySecondTest {

    RemoveDuplicatesFromSortedArraySecond removeDuplicates;

    @BeforeEach
    void setUp() {
        removeDuplicates = new RemoveDuplicatesFromSortedArraySecond();
    }

    @Test
    void removeDuplicatesShouldReturnFive() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int expected = 5;
        int actual = removeDuplicates.removeDuplicates(nums);
        assertEquals(expected, actual);
    }

    @Test
    void removeDuplicatesShouldReturnSeven() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int expected = 7;
        int actual = removeDuplicates.removeDuplicates(nums);
        assertEquals(expected, actual);
    }
}