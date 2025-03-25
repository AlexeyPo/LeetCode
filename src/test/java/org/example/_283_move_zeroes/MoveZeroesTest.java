package org.example._283_move_zeroes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    MoveZeroes moveZeroes;

    @BeforeEach
    void setUp() {
        moveZeroes = new MoveZeroes();
    }

    @AfterEach
    void tearDown() {
        moveZeroes = null;
    }

    @Test
    void moveZeroesReturnsSortedArray() {
        int[] nums = {0,1,0,3,12};
        int[] expected = {1,3,12,0,0};
        moveZeroes.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void moveZeroesReturnsSingleElementArray() {
        int[] nums = {0};
        int[] expected = {0};
        moveZeroes.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }
}