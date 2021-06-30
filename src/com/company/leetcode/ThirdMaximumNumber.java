package com.company.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int [] n = {2,2,3,1,5,3,2,1,5,6,22};
        System.out.println(thirdMaxSample(n));
        System.out.println(fourMaxSample(n));

    }
    public static int thirdMaxSample(int[] nums) {
     Integer max=null;
     Integer second_max =null;
     Integer third_max = null;

     for(Integer num : nums){
         if(num.equals(max) || num.equals(second_max) || num.equals(third_max)){
             continue;
         }
         if(max==null || num>max){
             third_max = second_max;
             second_max = max;
             max = num;
         }
         else if(second_max==null || num>second_max){
             third_max = second_max;
             second_max = num;
         }
         else if(third_max==null || num>third_max){
             third_max = num;
         }
     }
     if(third_max ==null){
         return max;
     }
     return third_max;
    }
    public static int fourMaxSample(int[] nums) {
        Integer max=null;
        Integer second_max =null;
        Integer third_max = null;
        Integer four_max =null;

        for(Integer num : nums){
            if(num.equals(max)||num.equals(four_max) || num.equals(second_max) || num.equals(third_max)){
                continue;
            }
            if(max==null || num>max){
                four_max = third_max;
                third_max = second_max;
                second_max = max;
                max = num;
            }
            else if(second_max==null || num>second_max){
                four_max=third_max;
                third_max = second_max;
                second_max = num;
            }
            else if(third_max==null || num>third_max){
                four_max = third_max;
                third_max = num;
            }
            else if(four_max==null || num>four_max){
                four_max = num;
            }
        }
        if(four_max ==null){
            return max;
        }
        return four_max;
    }

}
