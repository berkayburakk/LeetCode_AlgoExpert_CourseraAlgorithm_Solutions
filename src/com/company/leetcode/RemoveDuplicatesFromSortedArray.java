package com.company.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] dizi = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(dizi);
    }
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] !=nums[i+1]){
                nums[index++]=nums[i+1];
                //0 1
                // nums[2] = 1
                //[0 1 2]
                //[1 2]
                //
            }
        }
        return index;
    }
}

