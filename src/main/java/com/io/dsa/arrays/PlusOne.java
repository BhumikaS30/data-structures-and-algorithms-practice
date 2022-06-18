package com.io.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.pow;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;;
        int number = 0;
        List<Integer> list = new ArrayList<>();
        for (int num : digits) {
            number += (num * pow(10,i));
            i--;
        }
        number += 1;
        String s = String.valueOf(number);
        int[] arr = new int[s.length()];
        int j = 0;
        while (number > 0) {

        }

        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3};
        Arrays.stream(plusOne(arr)).forEach(System.out::println);
    }

}
