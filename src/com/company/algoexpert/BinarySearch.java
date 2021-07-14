package com.company.algoexpert;

import java.util.NoSuchElementException;

public class BinarySearch {
    public static void main(String[] args) {
        int[] n = {1,3,45,65,7,5,32,6,8,3};
        binarySearch(n,45);
    }
    public static int binarySearch(int[] array, int target) {
        // Write your code here.
        int lo =0;
        int hi =array.length-1;

        while(lo <= hi ) {

            int mid  = lo + (hi-lo)/2;
            int midVal = array[mid];
            if(midVal > target){
                hi--;
            } else if(midVal < target){
                lo++;
            }
            else if(midVal == target){
                return mid;
            }
        }
        return -1;
    }
}
