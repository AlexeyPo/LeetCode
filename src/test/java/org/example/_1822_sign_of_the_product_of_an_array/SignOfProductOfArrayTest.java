package org.example._1822_sign_of_the_product_of_an_array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignOfProductOfArrayTest {

    SignOfProductOfArray signOfProductOfArray;

    @BeforeEach
    void init() {
        signOfProductOfArray = new SignOfProductOfArray();
    }

    @AfterEach
    void destroy() {
        signOfProductOfArray = null;
    }

    @Test
    void arraySignShouldReturnOne() {
        int[] nums = {-1,-2,-3,-4,3,2,1};
        int expected = 1;
        int actual = signOfProductOfArray.arraySign(nums);
        assertEquals(expected, actual);
    }

    @Test
    void arraySignShouldReturnZero() {
        int[] nums = {1,5,0,2,-3};
        int expected = 0;
        int actual = signOfProductOfArray.arraySign(nums);
        assertEquals(expected, actual);
    }

    @Test
    void arraySignShouldReturnMinusOne() {
        int[] nums = {-1,1,-1,1,-1};
        int expected = -1;
        int actual = signOfProductOfArray.arraySign(nums);
        assertEquals(expected, actual);
    }

    @Test
    void arraySignShouldReturnMinusOneSecondVariant() {
        int[] nums = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        int expected = -1;
        int actual = signOfProductOfArray.arraySign(nums);
        assertEquals(expected, actual);
    }
}