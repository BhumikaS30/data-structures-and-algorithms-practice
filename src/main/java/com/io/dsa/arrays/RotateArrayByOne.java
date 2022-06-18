package com.io.dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.stream;

public class RotateArrayByOne {

    int[] arr;

    public RotateArrayByOne(int[] arr) {
        this.arr = arr;
    }

    public void rotateArrayByOne () {
        int temp = arr[0];
        int size = arr.length;
        for (int i = 0; i < size - 1;i++) {
            int temp1 = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp1;
        }
        arr[size - 1] = temp;
        stream(arr).forEachOrdered(System.out::println);
    }

    public  static int[]  twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            if (nums[start] + nums[end] == target) {
                break;
            }
            else if (nums[start] + nums[end] < target) {
                start++;
            }
            else {
                end--;
            }
        }

        int[] arr = new int[2];
        arr[0] = map.get(nums[start]);
        arr[1] = map.get(nums[end]);

        return arr;

    }

    public static void main(String[] args) {
        /*RotateArrayByOne rotateArrayByOne = new RotateArrayByOne(new int[] {1, 2, 3, 4, 5});
        rotateArrayByOne.rotateArrayByOne();*/
        int[] arr = {3,3};
        int[] ints = twoSum(arr, 6);
        System.out.println(Arrays.toString(ints));
    }
}
