package org.example.array_string._14_longest_common_prefix;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String out = "";
        String test = strs[0];

        for (String str : strs) {
            int length;
            StringBuilder temp = new StringBuilder();

            length = Math.min(test.length(), str.length());
            for (int j = 0; j < length; j++) {
                if (test.charAt(j) == str.charAt(j)) {
                    temp.append(test.charAt(j));
                } else {
                    break;
                }
            }
            test = temp.toString();
            out = temp.toString();
        }
        return out;
    }
}
