package com.company.leetcode;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String s =  "dog cat cat dog";
        String pattern = "abba";
        System.out.println(wordPattern(pattern,s));

    }
    public static boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<Character,String>();
        String [] wordArray = s.split(" ");
        if (pattern == null || s == null ||(pattern.length() !=s.length())) {
            return false;
        }
        else{
            for (int i = 0; i < pattern.length(); i++) {
                if(map.containsKey(pattern.charAt(i))){
                    if(!map.get(pattern.charAt(i)).equals(wordArray[i])){
                        return false;
                    }
                }
                else{
                    if(map.containsValue(wordArray[i])){
                        return false;
                     }
            map.put(s.charAt(i),wordArray[i+1]);

            }
        }
    }
        return true;
    }
    public static boolean wordPattern2(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i=0; i<words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
        //https://leetcode.com/problems/word-pattern/discuss/73402/8-lines-simple-Java
    }

    }
