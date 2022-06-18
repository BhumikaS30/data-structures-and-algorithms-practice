package com.io.dsa.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayInPlace {

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0;
        if (n == 0 || n == 1) {
            return n;
        }
        for (int i = 0; i < n-1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[n-1];
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int duplicates = removeDuplicates(nums);
        Arrays.stream(nums, 0, duplicates).forEach(System.out::println);
    }
}
