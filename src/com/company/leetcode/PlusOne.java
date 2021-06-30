package com.company.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] <= 8){
            digits[digits.length - 1]++;
            return digits;
        }
        else{
            int carry = 0;
            int sum = 1;
            for(int i = digits.length - 1; i >= 0; i--){
                sum = sum + digits[i] + carry;
                carry = sum/10;
                digits[i] = sum % 10;
                sum = 0;
            }
            if(digits[0] == 0){
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                return result;
            }
            return digits;
        }
    }
    public static int[] plusOneSample(int[] digits) {
        int n = digits.length;
        //[4 3 2 1]
        //[4 3 2 2]
        //[4 2 9 9]
        //[4 3 0 0]
        for (int i = n-1; i >=0 ;i--) {
            if(digits[i] <9){
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }
        int[] newNumber = new int[n+1];
        newNumber[0] = 1;
        return newNumber;

    }
}
