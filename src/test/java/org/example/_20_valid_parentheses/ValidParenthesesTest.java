package org.example._20_valid_parentheses;

import org.example.stack._20_valid_parentheses.ValidParentheses;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    private ValidParentheses validParentheses;
    @BeforeEach
    void init() {
        validParentheses = new ValidParentheses();
    }

    @AfterEach
    void destroy() {
        validParentheses = null;
    }

    @Test
    void isValidShouldReturnTrueOneTypeOfBrackets() {
        String s = "()";
        boolean actual = validParentheses.isValid(s);
        assertTrue(actual);
    }

    @Test
    void isValidShouldReturnTrueSeveralTypesOfBrackets() {
        String s = "[()]{}";
        boolean actual = validParentheses.isValid(s);
        assertTrue(actual);
    }

    @Test
    void isValidShouldReturnFalse() {
        String s = "]";
        boolean actual = validParentheses.isValid(s);
        assertFalse(actual);
    }

}