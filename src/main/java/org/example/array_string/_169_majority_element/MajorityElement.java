package org.example.array_string._169_majority_element;

import java.util.Arrays;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int counter = 1;
        int countNumsElement = 0;
        int resultInt = nums[0];

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                counter++;
            } else {
                if (countNumsElement < counter) {
                    resultInt = nums[i];
                    countNumsElement = counter;
                }
                counter = 1;
            }
        }
        return resultInt;
    }
}
