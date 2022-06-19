package com.io.dsa.arrays;

import java.util.Arrays;

public class CountTriplets {

    /**
     * The idea is to create a constant temp array 'index' and mark all the positions in index array = elements from source array 1
     * If index[sum of any 2 elements] = 1 in the index array increase the count.
     * Complexity :
     *
     * @param arr
     * @param n
     * @return
     */
    static int countTriplet(int[] arr, int n) {
        // Your code goes here

        int[] index = new int[1000000];
        int count = 0;

        for (int i = 0; i < n; i++) {
            index[arr[i]] = 1;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (index[arr[i] + arr[j]] == 1) {
                    count ++;
                }
            }
        }

        return count;

    }

    /**
     * This is a simple implementation where we follow steps :
     * - Sort the array
     * - For 2 contiguous elements i & j = i + 1 check the entire subarray from k = j + 1
     * if (arr[i] + arr[j] ) = any element in array from k = j + 1, count ++
     * @param arr
     * @param n
     * @return
     */
    static int countTriplet2(int[] arr, int n) {
        // Your code goes here
        int count=0;
        int sum;
        Arrays.sort(arr);

        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = arr[i] + arr[j];
                int k = j + 1;
                while (k != n) {
                    if (sum == arr[k])
                    {
                        count++;
                        break;
                    }
                    k++;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2};
        int triplet = countTriplet(arr, 4);
        int triplet2 = countTriplet2(arr, 4);

        System.out.println(triplet + " | " + triplet2);
    }

}
