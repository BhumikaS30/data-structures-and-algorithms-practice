package com.io.dsa.arrays;

public class ReverseNumber {

    public static int reverse(int x) {
        if (x < 0) {
            x = Math.abs(x);
            return -1 * reverseNum(x);
        }

        return reverseNum(x);
    }

    public static int reverseNum(int x) {
        long rem = 0;

        while (x != 0) {
            rem = (rem * 10) + (x % 10);
            x = x/10;
        }

        if (rem > Integer.MAX_VALUE) {
            return 0;
        }

        return (int)rem;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }


}
