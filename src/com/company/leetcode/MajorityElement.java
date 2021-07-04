package com.company.leetcode;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] n ={2,2,1,1,1,2,2};
        majorityElement(n);

    }

    public static int majorityElement(int[] num) {

        int major=num[0], count = 1;

        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;


    }

}

