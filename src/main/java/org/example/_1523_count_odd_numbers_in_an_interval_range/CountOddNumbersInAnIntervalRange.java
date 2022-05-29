package org.example._1523_count_odd_numbers_in_an_interval_range;

public class CountOddNumbersInAnIntervalRange {

    int countOdds(int low, int high) {
        return (low % 2 == 1 || high % 2 == 1) ? (high - low) / 2 + 1 : (high - low) / 2;
    }
}
