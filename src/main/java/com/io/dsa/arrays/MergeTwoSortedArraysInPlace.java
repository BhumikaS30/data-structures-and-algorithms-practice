package com.io.dsa.arrays;

import java.util.Arrays;

public class MergeTwoSortedArraysInPlace {

    public static void mergeTwoSorted(int[] arr1, int[] arr2, int n, int m) {
        int left = n - 1;
        int right = 0;

        while (left > 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                int  temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
            }
            left--;
            right++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void main(String[] args) {
       int[] arr1 = {1, 3, 5, 7};
       int[] arr2 = {0, 2, 6, 8, 9};
       mergeTwoSorted(arr1, arr2, 4, 5);
    }
}
