package org.example._58_length_of_last_word;

import org.example.array_string._58_length_of_last_word.LengthOfLastWord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    LengthOfLastWord lengthOfLastWord;

    @BeforeEach
    void setUp() {
        lengthOfLastWord = new LengthOfLastWord();
    }

    @Test
    void lengthOfLastWordShouldReturnFive() {
        String s = "Hello World";
        int expected = 5;
        int actual = lengthOfLastWord.lengthOfLastWord(s);
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLastWordShouldReturnFour() {
        String s = "   fly me   to   the moon  ";
        int expected = 4;
        int actual = lengthOfLastWord.lengthOfLastWord(s);
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLastWordShouldReturnSix() {
        String s = "luffy is still joyboy";
        int expected = 6;
        int actual = lengthOfLastWord.lengthOfLastWord(s);
        assertEquals(expected, actual);
    }
}