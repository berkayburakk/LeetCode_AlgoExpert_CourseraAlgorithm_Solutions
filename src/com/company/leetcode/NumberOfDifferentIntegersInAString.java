package com.company.leetcode;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDifferentIntegersInAString {
    public int numDifferentIntegers2(String word) {
        Set<String> set = new HashSet();
        char[] warr = word.toCharArray();
        int len = warr.length;
        int i=0;
        while(i<len){
            if(warr[i]-'0'<=9){
                int start = i;
                while(i<len && warr[i]-'0'<=9)
                    i++;
                while(start<i && warr[start]=='0')
                    start++;
                set.add(word.substring(start, i));
            }else
                i++;
        }
        return set.size();
    }
}

