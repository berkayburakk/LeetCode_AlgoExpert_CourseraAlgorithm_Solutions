package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int [] temp ={73,74,75,71,69,72,76,73};
        dailyTemperatures1(temp);

    }
    public static int[] dailyTemperatures1(int[] temperatures) {
        int[] stack = new int[temperatures.length];
        int top = -1;
        int[] ret = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            while(top > -1 && temperatures[i] > temperatures[stack[top]]) {
                int idx = stack[top--];
                ret[idx] = i - idx;
            }
            stack[++top] = i;
        }
        return ret;
    }
    public static int[] dailyTemperatures2(int[] temperatures){
        Stack<Integer> stack = new Stack<>();
        int[] map = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int topIndex = stack.pop();
                int diff = i-topIndex;
                map[topIndex] = diff;
            }
            stack.push(i);
        }
        return  map;
    }
}
