package com.company.algoexpert;

import java.util.Arrays;
import java.util.Collections;

public class SortedSquaredArray {
    public static void main(String[] args) {
        int [] n = {-10,-5,0,5,10};
        System.out.println(sortedSquaredArray(n));

    }
    public static int[] sortedSquaredArray(int[] array) {

        int[] sortedSquares = new int[array.length];
        int smallerValueIdx= 0;
        int largerValueIdx=  array.length-1;

        for(int idx = array.length-1; idx>=0; idx--){
            int smallerValue = array[smallerValueIdx];
            int largerValue  = array[largerValueIdx];
            if(Math.abs(smallerValue)> Math.abs(largerValue)){
                sortedSquares[idx] = smallerValue * smallerValue;
                smallerValueIdx++;
            }
            else {
                sortedSquares[idx] = largerValue* largerValue;
                largerValueIdx--;
            }
        }
        return sortedSquares;

    }
    public static int[] reverseArray(int[] array, int n){
        int[] reversedArray = new int[n];
        int k = n-1;
        for (int i = 0; i < n; i++) {
            reversedArray[k] = array[i];
            k--;
        }
        return reversedArray;

    }
}
