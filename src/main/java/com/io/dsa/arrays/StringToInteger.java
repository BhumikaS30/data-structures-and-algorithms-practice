package com.io.dsa.arrays;

public class StringToInteger {

    public static int myAtoi(String s) {
        int sign = 1;
        long num = 0;

        if (s == null || s.length() < 1)
            return 0;
         s = s.strip();

         if (s.isEmpty()) {
             return 0;
         }

         if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            sign = s.charAt(0) == '-' ? -1 : 1;
         }

         for ( int i = 0; i < s.length(); i++) {
             if (Character.isDigit(s.charAt(i))) {
                 num = num * 10 + Character.getNumericValue(s.charAt(i));
             }
             else {
                 if ((s.charAt(i) == '-' || s.charAt(i) == '+') && i == 0) {
                     continue;
                 }
                 break;
             }
             if (sign == 1 && num > Integer.MAX_VALUE) {
                 return Integer.MAX_VALUE;
             } else if (sign == -1 && num * sign < Integer.MIN_VALUE) {
                 return Integer.MIN_VALUE;
             }
         }

         return (int) num * sign;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("+-12"));
    }

}
