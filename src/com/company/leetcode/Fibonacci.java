package com.company.leetcode;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(13);

    }
    public static void fibonacci(int n){
        int[] myArray = new int[n];
        int size = myArray.length;

        myArray[0] = 1;
        myArray[1] = 1;
        for (int i = 1; i < size-1; i++) {
            myArray[i+1] = myArray[i] + myArray[i-1];
        }
        for(int item : myArray){
            System.out.print(item +"-");
        }
    }
}
