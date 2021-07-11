package com.company.leetcode;

public class MoveZeroes {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        moveZeroes(nums);

    }

    public static void moveZeroes(int[] nums)
    {
        for(int i =0,j=0; i<nums.length; i++)
        {
            if(nums[i] !=0)
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }

    }
}
