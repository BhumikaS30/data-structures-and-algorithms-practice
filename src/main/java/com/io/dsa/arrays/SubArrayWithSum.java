package com.io.dsa.arrays;

import java.util.ArrayList;

public class SubArrayWithSum {

    /**
     * The Idea is to check
     * - if curr_sum > given sum, then remove the entire subArray till now from curr_sum
     * - if curr_sum == given sum, then add first and last position of subArray and return list
     * - if curr_sum < given sum, and we have not reached end of the input array, add cuurent array element to curr_sum
     * @param arr
     * @param n
     * @param s
     * @return
     */
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        int curr_sum = arr[0], start = 0;
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            // Remove trailing numbers from sum if curr_sum > s
            while (curr_sum > s && start < i - 1) {
                curr_sum -= arr[start];
                start ++;
            }

            if(curr_sum == s) {
                resultList.add(start + 1);
                resultList.add(i);
                return resultList;
            }
            if (i < n) {
                curr_sum += arr[i];
            }
        }
        resultList.add(-1);
        return resultList;
    }

    public static void main(String[] args) {
        int[] arr = {135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134};
        subarraySum(arr, 42, 468).forEach(System.out::println);
    }

}
