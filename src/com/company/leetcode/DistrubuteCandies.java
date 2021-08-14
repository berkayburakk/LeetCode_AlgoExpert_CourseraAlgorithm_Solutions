package com.company.leetcode;

import java.util.HashSet;
import java.util.NoSuchElementException;

public class DistrubuteCandies {
    public static void main(String[] args) {
        int[] candyType = {1,1,2,3,3,4,5,5,5,7};
        // max = 5
        // type =6
        System.out.println(distributeCandies(candyType));

    }


    public static int distributeCandies(int[] candyType) {

        //n is always even

        int maxCanEat = candyType.length/2;
        int numberOfTypes = 0;
        HashSet<Integer> uniques = new HashSet<>();
        for(int type : candyType){
            if(uniques.add(type)){
                if(++numberOfTypes== maxCanEat) return maxCanEat;
            }
        }
        return  numberOfTypes;


    }
}
