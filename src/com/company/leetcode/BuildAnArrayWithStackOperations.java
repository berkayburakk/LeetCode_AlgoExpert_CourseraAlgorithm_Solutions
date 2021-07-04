package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {
    public static void main(String[] args) {
        int[] target = {1,2};
        int n=4;
        System.out.println(buildArray(target,n));
    }
    public static List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        //n ==3 se 3 ekadar olandizi olusturucak
        int[] myArray = new int[n];
        for(int i =1;i<=n;i++){
            myArray[i-1] = i;
        }
        int j=0;
        while(j<target.length){

         for (int i = 0; i < myArray.length; i++) {
             if(j >= target.length) break;

            if(myArray[i] == target[j]){
                list.add("Push");
                j++;
            }
            else if(myArray[i] != target[j]){
                list.add("Push");
                list.add("Pop");
            }
        }
        }
        return list;
    }
}
