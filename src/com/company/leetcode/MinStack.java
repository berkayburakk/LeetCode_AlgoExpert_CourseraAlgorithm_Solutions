package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MinStack {
    /** initialize your data structure here. */
    List<Map<String,Integer>> minMaxStack = new ArrayList<Map<String,Integer>>();
    List<Integer> stack = new ArrayList<Integer>();
    public MinStack() {}

    public int top() {
        return stack.get(stack.size()-1);
    }
    public void pop() {
        minMaxStack.remove(minMaxStack.size()-1);
        stack.remove(stack.size()-1);
    }
    public int getMin() {
        return minMaxStack.get(minMaxStack.size()-1).get("min");
    }
    public void push(int val) {
        Map<String,Integer> newMinValue = new HashMap<>();
        newMinValue.put("min",val);
        if(minMaxStack.size()>0){
            Map<String,Integer> lastMinMax = new HashMap<>(minMaxStack.get(minMaxStack.size()-1));
            newMinValue.replace("min",Math.min(val,lastMinMax.get("min")));
        }
        minMaxStack.add(newMinValue);
        stack.add(val);
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */