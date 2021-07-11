package com.company.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class CheckIfExist {
    public static void main(String[] args) {
        int[] n = {2,3,3,0,0};
        checkIfExist(n);

    }
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr) {
            if(set.contains(a*2) || (a%2 == 0 && set.contains(a/2))) return true;
            set.add(a);
        }
        return false;

    }
    public static boolean checkIfExist2(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        //O(N) operation
        for(int i =0;i <arr.length; i++){
            map.put(i,arr[i]);
        }
        int zeroCount=0;
        if(zeroCount>1) return true;
        for (int i = 0; i < map.size(); i++) {
            if(map.get(i) ==0) zeroCount++;
            int val = map.get(i) /2;
            if(zeroCount>1) return true;
            if(map.containsValue(val) && map.get(i)%2==0  && val !=0) return true;
        }
        return false;
    }

}
