package com.io.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums1) {
            map.put(num, (map.getOrDefault(num, 0) + 1) );
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] res = new int[list.size()];

        int i = 0;
        for (int element : list) {
            res[i] = element;
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,1};
        int[] b = {2,2};
        System.out.println(Arrays.toString(intersect(a, b)));
    }
}
