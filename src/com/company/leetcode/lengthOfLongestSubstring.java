package com.company.leetcode;

import java.util.*;

public class lengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "pwwkew";
        String q = "abcabcaabc";
        lengthOfLongestSubstring(s);
        lengthOfLongestSubstring(q);
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0, j = 0, i = 0;
        HashSet<Character> set = new HashSet<>();
        while (i < s.length()) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                set.remove(s.charAt(j));
                j++;
            } else {
                set.add(c);
                max = Math.max(i - j + 1, max);
                i++;
            }
        }
        return max;
    }
}

