package org.example._14_longest_common_prefix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    LongestCommonPrefix longestCommonPrefix;

    @BeforeEach
    void init() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @AfterEach
    void destroy() {
        longestCommonPrefix = null;
    }

    @Test
    void longestCommonPrefixShouldReturnFL() {
        String[] str = {"flower","flow","flight"};
        String expected = "fl";
        String actual = longestCommonPrefix.longestCommonPrefix(str);
        assertEquals(expected, actual);
    }

    @Test
    void longestCommonPrefixShouldReturnEmptyString() {
        String[] str = {"dog","racecar","car"};
        String expected = "";
        String actual = longestCommonPrefix.longestCommonPrefix(str);
        assertEquals(expected, actual);
    }
}