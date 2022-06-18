package com.io.dsa.arrays;

import java.util.HashMap;

public class FirstUniqueChar {

        public static int firstUniqChar(String s) {

            char[] chars = s.toCharArray();
            HashMap<Character, Integer> map = new HashMap<>();

            for(int i = 0; i < chars.length; i++) {
                if(map.containsKey(chars[i])) {
                    return map.get(chars[i]) - 1;
                }
                else {
                    map.put(chars[i], i);
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

}
