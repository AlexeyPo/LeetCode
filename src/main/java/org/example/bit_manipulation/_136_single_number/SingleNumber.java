package org.example.bit_manipulation._136_single_number;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int num = nums[0];
        if (nums.length == 1) {
            return num;
        }

        for (int i = 1; i < nums.length; i++) {
            num = num ^ nums[i];
        }
        return num;
    }
}
