package org.example._1523_count_odd_numbers_in_an_interval_range;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOddNumbersInAnIntervalRangeTest {

    CountOddNumbersInAnIntervalRange countOddNumbersInAnIntervalRange;

    @BeforeEach
    void init() {
        countOddNumbersInAnIntervalRange = new CountOddNumbersInAnIntervalRange();
    }

    @AfterEach
    void destroy() {
        countOddNumbersInAnIntervalRange = null;
    }

    @Test
    void countOddsShouldReturnThree() {
        int low = 3;
        int high = 7;
        int expected = 3;
        int actual = countOddNumbersInAnIntervalRange.countOdds(low, high);
        assertEquals(expected, actual);
    }

    @Test
    void countOddsShouldReturnOne() {
        int low = 8;
        int high = 10;
        int expected = 1;
        int actual = countOddNumbersInAnIntervalRange.countOdds(low, high);
        assertEquals(expected, actual);
    }
}