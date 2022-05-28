package org.example._268_missing_number;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int missed = nums.length;
        int temp = 0;
        Arrays.sort(nums);

        for (int num : nums) {
            if (temp == num) {
                temp++;
            } else {
                missed = temp;
                break;
            }
        }
        return missed;
    }
}
