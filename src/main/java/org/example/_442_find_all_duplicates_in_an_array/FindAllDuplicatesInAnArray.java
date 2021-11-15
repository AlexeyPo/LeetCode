package org.example._442_find_all_duplicates_in_an_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                result.add(nums[i]);
            }
        }
        return result;
    }
}
