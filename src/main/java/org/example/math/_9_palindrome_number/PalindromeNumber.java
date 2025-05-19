package org.example.math._9_palindrome_number;

import static java.lang.String.valueOf;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String line = valueOf(x);
        int length = line.length();

        for (int i = 0; i < length / 2; i++) {
            if (line.charAt(i) != line.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
