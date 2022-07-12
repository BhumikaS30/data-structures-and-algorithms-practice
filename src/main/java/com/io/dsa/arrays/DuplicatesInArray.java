package com.io.dsa.arrays;

import java.util.ArrayList;

public class DuplicatesInArray {
    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        // code here
        int[] tempArr = new int[n];
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            tempArr[arr[i]] += 1;
        }

        for (int i = 0; i < n; i++) {
            if (tempArr[i] > 1) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    public static ArrayList<Integer> duplicatesConstantSpace(int[] arr, int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] += n;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] / n >= 2) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr  = new int[]{0 ,0 , 2, 2};
        ArrayList<Integer> duplicates = duplicatesConstantSpace(arr, 4);
        System.out.println(duplicates);
    }
}
