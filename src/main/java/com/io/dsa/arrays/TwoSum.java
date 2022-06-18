package com.io.dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        int secondIndex;
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsValue(diff)) {
                secondIndex = map.entrySet()
                                 .stream()
                                 .filter(pair -> pair.getValue() == diff)
                                 .findFirst()
                                 .get().getKey();
                if (i!= secondIndex) {
                    res[0] = i;
                    res[1] = secondIndex;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int[] ints = twoSum(arr, 6);
        System.out.println(Arrays.toString(ints));
    }
}
