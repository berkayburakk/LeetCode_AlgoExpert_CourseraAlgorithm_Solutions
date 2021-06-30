package com.company.leetcode;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2};
        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        boolean dec = false;
        boolean ans = true;
        boolean inc = false;
        int i = 0;
        if (arr.length < 3) {
            return false;
        }
        while (i < arr.length - 1) {
            if (arr[i] < arr[i + 1] && !dec) {
                inc = true;
            } else if (arr[i] > arr[i + 1]) {
                dec = true;
            } else {
                ans = false;
                break;
            }
            i++;
        }
        return ans && inc && dec;
    }
}

