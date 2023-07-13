package org.example._58_length_of_last_word;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] strings = s.trim().split(" ");
        return strings[strings.length - 1].length();
    }
}
