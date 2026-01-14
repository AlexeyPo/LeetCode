package org.example.array_string._27_remove_element;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    RemoveElement removeElement;

    @BeforeEach
    void setUp() {
        removeElement = new RemoveElement();
    }

    @Test
    void removeElementShouldReturnSix() {
        int[] nums = new int[]{0,1,2,5,2,3,0,4,2};
        int val = 2;
        int expected = 6;
        int actual = removeElement.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    @Test
    void removeElementShouldReturnTwo() {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        int expected = 2;
        int actual = removeElement.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    @Test
    void removeElementShouldReturnFive() {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int expected = 5;
        int actual = removeElement.removeElement(nums, val);
        assertEquals(expected, actual);
    }
}