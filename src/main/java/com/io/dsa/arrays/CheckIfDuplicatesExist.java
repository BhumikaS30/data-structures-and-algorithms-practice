package com.io.dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckIfDuplicatesExist {

    public static int singleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i+=2) {
           if (nums[i] != nums[i+1]) {
               return nums[i];
           }
        }
        return nums[nums.length-1];
    }

    public static int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num,map.getOrDefault(num, 0) + 1);
        }

        Integer key = map.entrySet()
                         .stream()
                         .filter(entry -> entry.getValue() > 1)
                         .findFirst().map(Map.Entry::getKey).orElse(0);
        return key;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2}; // -> {1,1,2,2,4}
        int singleNumber = findDuplicate(arr);
        System.out.println(singleNumber);
    }

}
