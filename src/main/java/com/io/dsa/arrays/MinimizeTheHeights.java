package com.io.dsa.arrays;

import java.util.Arrays;

public class MinimizeTheHeights {

    public static int getMinDiff(int[] arr, int n, int k) {

        // Sort the Array
        Arrays.sort(arr);

        int ans = arr[n - 1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        int min,max;

        for (int i = 0; i < n - 1; i++) {
            min = Math.min(smallest, arr[i + 1] - k);
            max = Math.max(largest, arr[i] + k);
            if (min < 0) {
                continue;
            }

            ans = Math.max(ans, max - min);
        }
        return ans;
    }

}
