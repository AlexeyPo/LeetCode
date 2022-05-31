package org.example._976_largest_perimeter_triangle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPerimeterTriangleTest {

    LargestPerimeterTriangle largestPerimeterTriangle;

    @BeforeEach
    void init() {
        largestPerimeterTriangle = new LargestPerimeterTriangle();
    }

    @AfterEach
    void destroy() {
        largestPerimeterTriangle = null;
    }

    @Test
    void largestPerimeterShouldReturnFive() {
        int[] nums = {2,1,2};
        int expected = 5;
        int actual = largestPerimeterTriangle.largestPerimeter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void largestPerimeterShouldReturnZero() {
        int[] nums = {1,2,1};
        int expected = 0;
        int actual = largestPerimeterTriangle.largestPerimeter(nums);
        assertEquals(expected, actual);
    }
}