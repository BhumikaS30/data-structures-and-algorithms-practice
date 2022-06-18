package com.io.dsa.arrays;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {

    public static int doUnion(int a[], int n, int b[], int m)
    {
        Set<Integer> res = new HashSet<>(n + m);

        for (int i = 0; i < n; i++) {
            res.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            res.add(b[i]);
        }

        return res.size();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3,};
        System.out.println(doUnion(a, 5, b, 3 ));
    }
}
