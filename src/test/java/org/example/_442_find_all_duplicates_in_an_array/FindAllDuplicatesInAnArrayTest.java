package org.example._442_find_all_duplicates_in_an_array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllDuplicatesInAnArrayTest {

    FindAllDuplicatesInAnArray findAllDuplicates;

    @BeforeEach
    void init() {
        findAllDuplicates = new FindAllDuplicatesInAnArray();
    }

    @AfterEach
    void destroy() {
        findAllDuplicates = null;
    }

    @Test
    void testShouldReturnArrayWithTwoElements() {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> expected = List.of(2,3);
        List<Integer> actual = findAllDuplicates.findDuplicates(nums);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testShouldReturnArrayWithOneElement() {
        int[] nums = {1,1,2};
        List<Integer> expected = List.of(1);
        List<Integer> actual = findAllDuplicates.findDuplicates(nums);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testShouldReturnEmptyArray() {
        int[] nums = {1};
        List<Integer> expected = List.of();
        List<Integer> actual = findAllDuplicates.findDuplicates(nums);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

}