package com.company.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class LargestNumber {
    public static void main(String[] args) {
        int[] n = {3,30,34,5,9};
        largestNumber(n);
    }
    public static String largestNumber(int[] nums) {
        if(nums.length==0) return "";

        String[] array = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            array[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(array, new Comparator<String>() {
            public int compare(String a, String b) {
                String case1 = a+b;
                String case2 = b+a;
                return case2.compareTo(case1);
            }
        });

        if(array[0].equals("0")) return "0";
        StringBuilder sb =new StringBuilder();
        for(String item : array){
            sb.append(item);
        }

        return sb.toString();




    }
}
