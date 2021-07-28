package com.company.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;


public class RearrangeWordsInASentence {
    public static void main(String[] args) {
        String text = "Leetcode is cool";
        System.out.println(arrangeWords(text));


    }


    public static String arrangeWords(String text) {

        if(text.length() == 0)
            return text;
        text = text.toLowerCase();
        String[] split = (text.split("\\s+"));

        Arrays.sort(split,(s1, s2)->(s1.length() - s2.length()));
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<split.length;i++){
            if(i == 0)
                split[i] = Character.toUpperCase(split[i].charAt(0)) + split[i].substring(1);
            sb.append(split[i]);
            if(i != split.length-1)
                sb.append(" ");
        }

        return new String(sb);
    }
}
