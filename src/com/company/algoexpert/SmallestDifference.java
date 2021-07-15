package com.company.algoexpert;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SmallestDifference {
    public static void main(String[] args) {
        int [] n1 = {-1,5,10,20,28,3};
        int [] n2 = {26,134,135,15,17};
        System.out.println(smallestDifference(n1,n2));
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo)  {

        Arrays.sort(arrayOne); // O(nlogn)
        Arrays.sort(arrayTwo); // O(mlogm)    resultApprx = O(nlogn + mlogm)
        int oneIdx = 0;
        int twoIdx =0;
        int [] smallestPair = new int[2];
        int smallest = Integer.MAX_VALUE;
        int curr = Integer.MAX_VALUE;

        while(oneIdx < arrayOne.length && twoIdx < arrayTwo.length){
            int firstNum = arrayOne[oneIdx];
            int secondNum = arrayTwo[twoIdx];
            if( secondNum > firstNum ){
                curr = secondNum - firstNum;
                oneIdx++;
            } else if( firstNum > secondNum ){
                curr = firstNum-secondNum;
                twoIdx++;
            }
            else {
                return new int[] {firstNum,secondNum};
            }
            if( smallest > curr ){

                smallest = curr;
                smallestPair = new int[]{firstNum,secondNum};
            }
        }
        // Write your code here.
        return smallestPair;
    }
}
