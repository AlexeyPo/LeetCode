package org.example.math._66_plus_one;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] plusOne(int[] digits) {
        int value = 0;
        List<Integer> list = new ArrayList<>();

        if (digits[digits.length - 1] == 9) {
            value = 1;
        }
        list.add((digits[digits.length - 1] + 1) % 10);

        for (int i = digits.length - 2; i >= 0; i--) {
            list.add((digits[i] + value) % 10);
            if ((digits[i] + value) >= 10) {
                value = 1;
            } else value = 0;
        }
        if (value == 1) {
            list.add(1);
        }

        int[] array = new int[list.size()];

        for (int k = 0, j = list.size() - 1; k < list.size(); k++, j--) {
            array[k] = list.get(j);
        }
        return array;
    }
}
