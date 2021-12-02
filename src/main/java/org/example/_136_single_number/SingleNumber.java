package org.example._136_single_number;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            num = num ^ nums[i];
        }
        return num;
    }
}
