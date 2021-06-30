package com.company.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class minPairSum {
    public static void main(String[] args) {
        int[] num = {3,2,4,1,1,5,1,3,5,1};
        System.out.println(minPairSum(num));

    }
    public static int minPairSum(int[] nums) {
        int maxNumber=Integer.MIN_VALUE,minNumber=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int toplam=0;

        int start =0;//234456
        int end = nums.length-1;
        while(start < end){
            toplam = Math.max(toplam,nums[start]+nums[end]);
            end--;
            start++;
        }
        return toplam;

    }
}
