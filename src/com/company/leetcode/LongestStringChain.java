            package com.company.leetcode;

import java.util.*;

public class LongestStringChain {
    public static void main(String[] args) {
        String[] n = {"xbc","pcxbcf","xb","cxbc","pcxbc"};
       System.out.println(longestStrChain(n));

    }
    public static int longestStrChain(String[] words) {
        Arrays.sort(words,new Comparator<String>(){
           @Override
            public int compare(String o1,String o2){
               return o1.length()-o2.length();
           }
        });
        int res = 0;
        HashMap<String,Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,1);
            for (int i = 0; i < word.length(); i++) {
                StringBuilder current = new StringBuilder(word);
                String next = current.deleteCharAt(i).toString();
                if(map.containsKey(next)){
                    map.put(word,Math.max(map.get(word),map.get(next)+1));
                }
            }
            res = Math.max(res,map.get(word));

        }

        return  res;
    }
}
