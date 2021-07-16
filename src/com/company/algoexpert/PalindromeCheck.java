package com.company.algoexpert;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {

        int start =0;
        int end =str.length()-1;
        boolean result = false;

        while(start<=end){
            if(str.charAt(start) == str.charAt(end)){
                result =true;
            }
            else return false;
            start++;
            end--;
        }
        return result;
    }
    public static boolean isPalindrome2(String str) {
        StringBuilder sb =new StringBuilder();
        for(int i =str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));

        }
        return str.equals(sb.toString());
        // Write your code here.
    }
}
