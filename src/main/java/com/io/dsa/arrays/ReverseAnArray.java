package com.io.dsa.arrays;

import java.util.Arrays;

public class ReverseAnArray {

    int[] arr;

    public ReverseAnArray(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        ReverseAnArray reverseAnArray = new ReverseAnArray(new int[] {7, 5, 2, 1, 14, 2});
        reverseAnArray.reverseAnArray();
    }

    public void reverseAnArray() {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        Arrays.stream(arr).forEachOrdered(System.out::println);
    }
}
