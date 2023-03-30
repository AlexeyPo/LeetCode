package org.example._387_first_unique_character_in_string;


public class FirstUniqueCharacterInString {

    public int firstUniqChar(String s) {
        if (s.length() > 1) {
            for (int i = 0; i < s.length(); i++) {
                int counter = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (i == j)
                        continue;
                    if (s.charAt(i) == s.charAt(j)) {
                        counter++;
                        break;
                    }
                }
                if (counter == 0)
                    return i;
            }
        } else {
            return 0;
        }
        return -1;
    }
}
