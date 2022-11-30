package org.example._242_valid_anagram;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    private ValidAnagram validAnagram;

    @BeforeEach
    void init() {
        validAnagram = new ValidAnagram();
    }

    @AfterEach
    void destroy() {
        validAnagram = null;
    }

    @Test
    void isAnagramShouldReturnTrue() {
        String a = "anagram";
        String b = "nagaram";
        boolean actual = validAnagram.isAnagram(a, b);
        assertTrue(actual);
    }

    @Test
    void isAnagramShouldReturnFalse() {
        String a = "rat";
        String b = "car";
        boolean actual = validAnagram.isAnagram(a, b);
        assertFalse(actual);
    }
}