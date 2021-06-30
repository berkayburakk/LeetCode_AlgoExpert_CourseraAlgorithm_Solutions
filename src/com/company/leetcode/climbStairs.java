package com.company.leetcode;

public class climbStairs {
    public static void main(String[] args) {
        int n = 6;

        System.out.println(climbStairs(n));

    }
    public static int climbStairs(int n) {
        int [] arr = new int[n+1];
        arr[0] =1;
        arr[1] = 1;

        for (int i = 1; i < n; i++) {
            arr[i+1] += arr[i]+arr[i-1];

        }
        return arr[n];

    }


}
