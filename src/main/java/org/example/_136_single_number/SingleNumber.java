package org.example._136_single_number;

import java.util.Arrays;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int num = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int i;
        for (i = 0; i < nums.length-1; i++) {
            System.out.println(nums[i]);
            System.out.println(nums[i+1]);
            if (nums[i] == nums[i+1]) {
                System.out.println("num = " + num);
            }
        }
        return num;
    }
}
