package org.example.hashmap._242_valid_anagram;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        String sSorted = Arrays.stream(s.split("")).sorted().collect(Collectors.joining(""));
        String tSorted = Arrays.stream(t.split("")).sorted().collect(Collectors.joining(""));

        return sSorted.equals(tSorted);
    }
}
