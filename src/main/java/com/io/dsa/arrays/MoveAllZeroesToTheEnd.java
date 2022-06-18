package com.io.dsa.arrays;

import java.util.Arrays;

public class MoveAllZeroesToTheEnd {

    int[] arr;

    public MoveAllZeroesToTheEnd(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        MoveAllZeroesToTheEnd moveAllZeroesToTheEnd =
            new MoveAllZeroesToTheEnd(new int[] {1, 2, 4, 0, 5, 0, 3, 0, 2, 4});
        moveAllZeroesToTheEnd.moveAllZeroesToTheEnd();
    }

    public void moveAllZeroesToTheEnd() {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        Arrays.stream(arr).forEachOrdered(System.out::println);
    }
}
