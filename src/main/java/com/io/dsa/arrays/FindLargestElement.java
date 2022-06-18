package com.io.dsa.arrays;

import static java.lang.Math.max;

public class FindLargestElement {

    int[] arr;

    public FindLargestElement(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        FindLargestElement findLargestElement = new FindLargestElement(new int[] {11, 120, 3, 100, 1, 5});
        System.out.println(findLargestElement.findLargestElementWithRecursion(6));
    }

    public int findLargestElementFromArray() {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        System.out.println("Largest Element is -> " + arr[max]);
        return max;
    }

    public int findLargestElementWithRecursion(int size) { // -> O(N)

        int max;

        if (size == 1) {
            return arr[0];
        } else {
            max = findLargestElementWithRecursion(size - 1);
        }
        max = max(max, arr[size - 1]);

        return max;
    }
}
