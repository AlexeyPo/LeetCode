package org.example.array_string._189_rotate_array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    RotateArray rotateArray;

    @BeforeEach
    void setUp() {
        rotateArray = new RotateArray();
    }

    @AfterEach
    void tearDown() {
        rotateArray = null;
    }

    @Test
    void rotateReturnResultAfterThreeSteps() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateReturnResultAfterTwoSteps() {
        int[] nums = {-1,-100,3,99};
        int k = 2;
        int[] expected = {3,99,-1,-100};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }
}