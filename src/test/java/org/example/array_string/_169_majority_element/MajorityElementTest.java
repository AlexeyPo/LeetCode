package org.example.array_string._169_majority_element;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    private MajorityElement majorityElement;

    @BeforeEach
    void init() {
        majorityElement = new MajorityElement();
    }

    @AfterEach
    void destroy() {
        majorityElement = null;
    }

    @Test
    void majorityElementReturnTwo() {
        int[] nums = {2,2,1,1,1,2,2};
        int expected = 2;
        int actual = majorityElement.majorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    void majorityElementReturnThree() {
        int[] nums = {3,2,3};
        int expected = 3;
        int actual = majorityElement.majorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    void majorityElementReturnFortySeven() {
        int[] nums = {47,47,72,47,72,47,79,47,12,92,13,47,47,83,33,15,18,47,47,47,47,64,47,65,47,47,47,47,70,47,47,55,
                47,15,60,47,47,47,47,47,46,30,58,59,47,47,47,47,47,90,64,37,20,47,100,84,47,47,47,47,47,89,47,36,47,60,
                47,18,47,34,47,47,47,47,47,22,47,54,30,11,47,47,86,47,55,40,49,34,19,67,16,47,36,47,41,19,80,47,47,27};
        int expected = 47;
        int actual = majorityElement.majorityElement(nums);
        assertEquals(expected, actual);
    }
}
