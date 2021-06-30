package com.company.leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        searchInsertWithBinarySearch(nums, 2);
    }

    // mid'i bulma formülü matematiksel m =  l + (h-l/2)

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] < target)
                continue;

            else if (nums[i] > target) {
                if (nums.length == 1) {
                    i++;
                    return i-1;
                }
                return i;
            }
        }
        return nums.length;
    }
    public static int searchInsertWithBinarySearch(int[] nums, int target) {
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) end = mid-1;
            else start = start+1;
        }
        return start;}



    }
