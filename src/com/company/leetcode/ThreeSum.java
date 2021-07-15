package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {


    }
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }
    public List<List<Integer>> threeSum2(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> list = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {
            if(i==0 || (i>0 && num[i] != num[i-1])){
                int low = i+1;
                int high = num.length-1;
                int sum = 0-num[i];
                // -1, 0 , 1 ,2 -1 -4
                //-4, -1, 0 ,1 ,2
                while(low<high){
                    if(num[low] + num[high] == sum){
                        list.add(Arrays.asList(num[i],num[low],num[high]));
                        while(low<high && num[low] == num[low+1]) low++;
                        while(low<high && num[high] == num[high-1]) high--;
                        low++;
                        high--;
                    }else if(num[low] + num[high] <sum) low++;
                    else high--;
                }
            }
        }
        return list;
    }
        //With Bruteforce calculate count
    public static int count(int[] a){
        int N = a.length;
        int count = 0;
        for (int i = 0; i < N; i++)
            for (int j = i+1; j <N ; j++)
                for (int k = j+1; k < N; k++)
                    if(a[i] + a[j]+a[k]==0) {
                        count++;
                    }
        return count;

    }
    public List<List<Integer>> threeSum3(int [] num ){
        Arrays.sort(num);
        List<List<Integer>> list = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {
            if(i==0 || (i>0 && num[i] != num[i-1])){
                int low = i+1;
                int high = num.length-1;
                int sum = 0-num[i];
                while(low<high) {
                    if (num[low] + num[high] == sum) {
                        list.add(Arrays.asList(num[i], num[low], num[high]));
                        while (low < high && num[low] == num[low + 1]) low++;
                        while (low < high && num[high] == num[high - 1]) high--;
                        low++;
                        high--;
                    }
                    else if(num[low] + num[high] < sum) low++;
                    else high--;
                }
            }
            // -1, 0 , 1 ,2 -1 -4
            //-4, -1, 0 ,1 ,2
        }
        return list;
    }

    public List<Integer[]> threeSum4(int[] array , int targetSum){

        Arrays.sort(array);
        List<Integer[]> list = new LinkedList<>();

        for (int i = 0; i < array.length-2; i++) {
            int hi = array.length-1;
            int lo = i+1;
            while(lo < hi){
               int currentSum = array[i] + array[lo]+ array[hi];
               if(currentSum == targetSum){
                   Integer[] newTriplets = new Integer[] {i,lo,hi};
                   list.add(newTriplets);
                   lo++;
                   hi--;
               }
               else if(currentSum < targetSum){
                   lo++;
               }
               else if(currentSum > targetSum){
                   hi--;
               }
            }
        }
        return list;
    }

}
