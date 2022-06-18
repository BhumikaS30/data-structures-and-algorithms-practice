package com.io.dsa.arrays;

import java.util.Arrays;

public class MoveNegativeToLeftAndPositiveToRight {

    public static void moveElements(int[] arr) {
        int pivot = 0;
        int i = -1;
        for ( int j = 0; j < arr.length; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(i, j, arr);
            }
        }
    }

    public static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main (String[] args) {
        int[] arr = {-1, -3, -7, 4, 5, 6, 2, 8, 9 };
        moveElements(arr);
        System.out.println(Arrays.toString(arr));
    }

}
