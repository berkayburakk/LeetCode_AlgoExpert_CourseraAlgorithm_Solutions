package com.company.algoexpert;

import java.util.*;

public class NonConstructibleChange {
    public static void main(String[] args) {
        int[] n = {6,4,5,1,1,8,9};
        System.out.println(nonConstructibleChange(n));

    }

    public static int nonConstructibleChange(int[] coins) {

        Arrays.sort(coins);

        int change = 0;
        for(int coin : coins){
            if(coin > change+1){
                return change +1;

            }

            change +=coin;
        }
        return change+1;
    }
}

