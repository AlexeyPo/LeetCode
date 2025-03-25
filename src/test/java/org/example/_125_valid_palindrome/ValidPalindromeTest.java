package org.example._125_valid_palindrome;

import org.example.two_pointers._125_valid_palindrome.ValidPalindrome;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    ValidPalindrome validPalindrome;

    @BeforeEach
    void init() {
        validPalindrome = new ValidPalindrome();
    }

    @AfterEach
    void destroy() {
        validPalindrome = null;
    }

    @Test
    void isPalindromeShouldReturnTrue() {
        String s = "A man, a plan, a canal: Panama";
        boolean actual = validPalindrome.isPalindrome(s);
        assertTrue(actual);
    }

    @Test
    void isPalindromeShouldReturnFalse() {
        String s = "race a car";
        boolean actual = validPalindrome.isPalindrome(s);
        assertFalse(actual);
    }

    @Test
    void isPalindromeShouldReturnTrueWithEmptyString() {
        String s = " ";
        boolean actual = validPalindrome.isPalindrome(s);
        assertTrue(actual);
    }
}