package com.company.leetcode;

import java.util.*;

public class ValidSubsequences {
    public static void main(String[] args) {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 10);
        isValidSubsequence(array,sequence);
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        int arrIndex=0,seqIndex=0;
        while(arrIndex<array.size() && seqIndex<sequence.size()){
            if(array.get(arrIndex).equals(sequence.get(seqIndex))){
                seqIndex++;
            }
            arrIndex++;
        }
        return seqIndex==sequence.size();
        // Write your code here.
    }
}
