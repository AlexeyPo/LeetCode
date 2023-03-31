package org.example._26_remove_duplicates_from_aorted_array;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int k = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[k] = nums[i + 1];
                k++;
            }
        }
        return k;
    }
}
