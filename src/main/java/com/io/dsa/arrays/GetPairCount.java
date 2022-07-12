package com.io.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class GetPairCount {

    public static int getPairsCount(int arr[], int n, int k) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(k - arr[i])) {
                count += map.get(k - arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 7, 1};
        System.out.println(getPairsCount(arr, 4, 6));
    }
}
