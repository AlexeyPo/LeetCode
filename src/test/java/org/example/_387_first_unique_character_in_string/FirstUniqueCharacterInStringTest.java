package org.example._387_first_unique_character_in_string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInStringTest {

    FirstUniqueCharacterInString firstUniqueCharacterInString;

    @BeforeEach
    void setUp() {
        firstUniqueCharacterInString = new FirstUniqueCharacterInString();
    }

    @AfterEach
    void tearDown() {
        firstUniqueCharacterInString = null;
    }

    @Test
    void firstUniqCharShouldReturnZero() {
        String s = "leetcode";
        int expected = 0;
        int actual = firstUniqueCharacterInString.firstUniqChar(s);
        assertEquals(expected, actual);
    }

    @Test
    void firstUniqCharShouldReturnTwo() {
        String s = "loveleetcode";
        int expected = 2;
        int actual = firstUniqueCharacterInString.firstUniqChar(s);
        assertEquals(expected, actual);
    }

    @Test
    void firstUniqCharShouldReturnMinusOne() {
        String s = "aabb";
        int expected = -1;
        int actual = firstUniqueCharacterInString.firstUniqChar(s);
        assertEquals(expected, actual);
    }
}