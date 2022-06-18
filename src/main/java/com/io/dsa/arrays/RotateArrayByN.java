package com.io.dsa.arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static java.util.Arrays.stream;

public class RotateArrayByN {

    int[] arr;

    public RotateArrayByN(int[] arr) {
        this.arr = arr;
    }

    public void rotateArrayByNSolution1 (int rotateBy) {  // O(N)

        int[] temp = new int[arr.length];

        // Copy first N (rotateBy) elements to a temp array -> O(rotateBy)
        for (int i = 0 ; i < rotateBy; i++) {
            temp[i] = arr[i];
        }

        //Shift remaining elements to left by N (rotateBy) steps -> O(N)
        for (int i = rotateBy ; i < arr.length; i++) {
            arr[i - rotateBy] = arr[i];
        }

        //Copy the N (rotateBy) elements from temp array -> O(rotateBy)
        for (int i = 0 ; i < rotateBy; i++) {
            arr[arr.length - rotateBy + i] = temp[i];
        }

        stream(arr).forEachOrdered(System.out::println);

    }

    public void rotateArrayByNSolution2 (int rotateBy) {  // O(N)

        //reverse first N (rotateBy) elements
        int length = arr.length;
        reverse(length - rotateBy, length - 1); // -> O(rotateBy)
        //reverse remaining elements
        reverse(0, length - rotateBy - 1); // -> O(rotateBy)
        //reverse all
        reverse(0, length - 1); // -> O(N)

        stream(arr).forEachOrdered(System.out::println);
    }

    private void reverse(int low, int high) {

        while(low < high) {
           int temp  = arr[low];
           arr[low] = arr[high];
           arr[high] = temp;
           low ++;
           high --;
        }
    }
    public static void main(String[] args) {

        RotateArrayByN rotateArrayByN = new RotateArrayByN(new int[] {1, 2, 3, 4, 5});
        rotateArrayByN.rotateArrayByNSolution1(3);
        System.out.println("By solution 2 -> ");
        RotateArrayByN rotateArrayByN2 = new RotateArrayByN(new int[] {1,2,3,4,5,6,7});
        rotateArrayByN2.rotateArrayByNSolution2(3);
    }
}
