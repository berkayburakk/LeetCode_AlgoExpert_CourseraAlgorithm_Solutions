package com.company.leetcode;


import java.util.*;

public class RemoveOneElementtoMaketheArrayStrictlyIncreasing {
    public static void main(String[] args) {
        int [] nums = {2,3,1,2,6,7,12,5};
        canBeIncreasing(nums);


    }
    public static boolean canBeIncreasing2(int[] nums) {

        boolean removed = false;
        for(int i=1;i<nums.length;i++)
            if(nums[i] <= nums[i-1]) {
                if(removed) return false;
                removed = true;
                if (i>1 && nums[i] <= nums[i-2])
                    nums[i] = nums[i-1];
            }
        return true;
    }
    public static boolean canBeIncreasing(int[] nums) {
        int prev = nums[0];
        boolean used= false;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] <=prev) {
                if (used)
                    return false;
                used = true;
                if (i == 1 || nums[i] > nums[i - 2])
                    prev = nums[i];
            }
            else prev = nums[i];
        }
        return  true;
    }

    }
