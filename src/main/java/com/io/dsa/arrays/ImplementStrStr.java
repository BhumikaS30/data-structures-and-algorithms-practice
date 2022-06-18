package com.io.dsa.arrays;

public class ImplementStrStr {

    public static int strStr(String haystack, String needle) {

        int size = haystack.length();
        int len = needle.length();

        if (needle.length() == 0) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return - 1;
        }
        for (int i =0;i<size-len+1;i++){

            int j = 0;
            int k = i;
            while(haystack.charAt(k) == needle.charAt(j)){
                k++;j++;
                if(j==len)
                    return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issip"));
    }

}
