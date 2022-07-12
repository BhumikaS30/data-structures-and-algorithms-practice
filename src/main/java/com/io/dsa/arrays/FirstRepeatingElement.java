package com.io.dsa.arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {

    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        /*
        1. Create a frequency map with element and index
        2. While creating map if element is present in map check min
        3. If min is not n means elements repeated, return min else -1;
        */
        Map<Integer, Integer> indexMap = new HashMap<>();
        int min = n;

        for (int i = 0; i < n; i++) {
            if (indexMap.containsKey(arr[i])) {
                int key=indexMap.get(arr[i]);
                min= Math.min(key, min);
            }
            else {
                indexMap.put(arr[i],i);
            }
        }

        if (min == n) {
            return -1;
        }
        return min + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeated(arr, 7));
    }
}
