package com.company.leetcode;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static void main(String[] args) {
        String n = "32";
        System.out.println(minPartitions(n));

    }
    public static int minPartitions(String n) {
        {

            int min = Integer.MIN_VALUE;
            for (int i = 0; i < n.length(); i++) {


            }
            for (int i = 0; i < n.length(); i++) {
                int temp = n.charAt(i) - '1';
                if (temp > min) {
                    min = temp;
                }

            }

            return min;
        }
    }

}
