package org.example._70_climbing_stairs;

import org.example.d_dp._70_climbing_stairs.ClimbingStairs;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    ClimbingStairs climbingStairs;

    @BeforeEach
    void init() {
        climbingStairs = new ClimbingStairs();
    }

    @AfterEach
    void destroy() {
        climbingStairs = null;
    }

    @Test
    void testShouldReturnTwoWays() {
        int n = 2;
        int expected = 2;
        int actual = climbingStairs.climbStairs(n);
        assertEquals(expected, actual);
    }

    @Test
    void testShouldReturnThreeWays() {
        int n = 3;
        int expected = 3;
        int actual = climbingStairs.climbStairs(n);
        assertEquals(expected, actual);
    }
}