package com.company.leetcode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] myArray = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(myArray);
    }
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;

//        for(int i = 0; i < nums.length; i++){
//            max = Math.max(sum+=nums[i], max);
//            sum = Math.max(sum, 0);
//        }
//
//        return max;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > max)
                max = sum;
            if(sum < 0)
                sum = 0;
        }
        return max;

    }
    public static int maxSubArray2(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum=0;
        //MAXİMUM TOPLAMI BULACAĞIZ
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if(sum<0){
                sum = 0;
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }

    }
