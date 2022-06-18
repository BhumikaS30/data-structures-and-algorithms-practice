package com.io.dsa.arrays;

public class checkPalindrome {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return s.equals(new StringBuilder(s.toLowerCase()).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));
    }

}
