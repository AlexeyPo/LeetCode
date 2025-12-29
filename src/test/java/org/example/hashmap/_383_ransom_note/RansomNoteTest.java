package org.example.hashmap._383_ransom_note;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    RansomNote ransomNote;

    @BeforeEach
    void setUp() {
        ransomNote = new RansomNote();
    }

    @AfterEach
    void tearDown() {
        ransomNote = null;
    }

    @Test
    void canConstructReturnFalse() {
        String ransom = "a";
        String magazine = "b";
        boolean actual = ransomNote.canConstruct(ransom, magazine);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void canConstructReturnTrue() {
        String ransom = "aa";
        String magazine = "aab";
        boolean actual = ransomNote.canConstruct(ransom, magazine);
        boolean expected =  true;
        assertEquals(expected, actual);
    }
}