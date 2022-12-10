package org.example._344_reverse_string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    ReverseString reverseString;

    @BeforeEach
    void setUp() {
        reverseString = new ReverseString();
    }

    @AfterEach
    void tearDown() {
        reverseString = null;
    }

    @Test
    void reverseStringShouldReturnOlleh() {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        reverseString.reverseString(str);
        assertArrayEquals(expected, str);
    }

    @Test
    void reverseStringShouldReturnHannaH() {
        char[] str = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] expected = {'h', 'a', 'n', 'n', 'a', 'H'};
        reverseString.reverseString(str);
        assertArrayEquals(expected, str);
    }
}