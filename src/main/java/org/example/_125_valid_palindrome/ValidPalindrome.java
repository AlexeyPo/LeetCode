package org.example._125_valid_palindrome;


public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String replaced = s.toLowerCase().replaceAll("[^a-z\\d]", "");

        if (replaced.length() > 0) {
            String reversed = new StringBuilder(replaced).reverse().toString();

            return replaced.equals(reversed);
        } else {
            return true;
        }
    }
}
