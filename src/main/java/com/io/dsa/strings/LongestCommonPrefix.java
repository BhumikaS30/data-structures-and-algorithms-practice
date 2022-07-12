package com.io.dsa.strings;

public class LongestCommonPrefix {

    static String longestCommonPrefix(String[] arr, int n){
        // code here
        if (arr.length == 0) return "-1";
        String prefix = arr[0];
        for (int i = 1; i < n; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.isEmpty()) {
                return "-1";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"geeksforgeeks", "geeks", "geek",
            "geezer"}, 4));
    }

}
