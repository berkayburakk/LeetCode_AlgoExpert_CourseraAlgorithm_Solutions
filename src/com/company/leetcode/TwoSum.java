package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target- nums[i];
            if(map.containsKey(complement)){
                result[1] = i;
                result[0] = map.get(complement);
                return result;
            }
            map.put(nums[i],i );
        }
        return  result;
    }
    public int[] twoSum2(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        //2-7-9 target = 9
        for (int i = 0; i < nums.length; i++) {
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int [] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No match");
    }
    }
