package org.example._704_binary_search;


public class BinarySearch {

    public int search(int[] nums, int target) {
//        int result = Arrays.binarySearch(nums, target);
//        return result < 0 ? -1 : result;

        int first = 0;
        int last = nums.length - 1;

        while (first <= last) {
            int middle = (first + last) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (target > nums[middle]) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        return -1;
    }
}
