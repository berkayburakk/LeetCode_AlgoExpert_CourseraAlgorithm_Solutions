package com.company.leetcode;

public class PerfectNumber {
    public static void main(String[] args) {
    int n = 6;
    System.out.println(checkPerfectNumber(n));
    }
    public static boolean checkPerfectNumber(int num){
        //Sayının kareköküne kadar tararsak daha yüksek ihtimal buluruz.
        int sqrtNum = (int)Math.sqrt(num);
        if(num == 1) return false;

        int sum = 1;

        for (int i = 2; i < sqrtNum; i++)
            if(num %i ==0) sum +=i+num / i;

        return sum == num;

    }
}
