package org.example.array_string._80_remove_duplicates_from_sorted_array_second;

public class RemoveDuplicatesFromSortedArraySecond {

    public int removeDuplicates(int[] nums) {
        int index = 1;
        int k = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && k < 2) {
                nums[index] = nums[i + 1];
                index++;
                k++;
            }
            if (nums[i] < nums[i + 1]) {
                nums[index] = nums[i + 1];
                index++;
                k = 1;
            }
        }
        return index;
    }
}
