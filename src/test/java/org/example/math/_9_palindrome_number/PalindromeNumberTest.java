package org.example.math._9_palindrome_number;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    PalindromeNumber palindromeNumber;

    @BeforeEach
    void setUp() {
        palindromeNumber = new PalindromeNumber();
    }

    @AfterEach
    void tearDown() {
        palindromeNumber = null;
    }

    @Test
    void isPalindromeForOmeHundredAndTwentyOneReturnTrue() {
        int x = 121;
        boolean actual = palindromeNumber.isPalindrome(x);
        assertTrue(actual);
    }

    @Test
    void isPalindromeForMinusOmeHundredAndTwentyOneReturnFalse() {
        int x = -121;
        boolean actual = palindromeNumber.isPalindrome(x);
        assertFalse(actual);
    }

    @Test
    void isPalindromeForTenReturnFalse() {
        int x = 10;
        boolean actual = palindromeNumber.isPalindrome(x);
        assertFalse(actual);
    }
}