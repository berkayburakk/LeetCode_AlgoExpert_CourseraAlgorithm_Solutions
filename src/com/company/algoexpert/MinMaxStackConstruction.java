package com.company.algoexpert;

import java.util.*;

 class MinMaxStackConstruction {
    public static void main(String[] args) {
        MinMaxStack stack = new MinMaxStack();
        stack.push(5);
        testMinMaxPeek(5, 5, 5, stack);
        stack.push(7);
        testMinMaxPeek(5, 7, 7, stack);
        stack.push(2);
        testMinMaxPeek(2, 7, 2, stack);
        assert (stack.pop() == 2);
        assert (stack.pop() == 7);
        testMinMaxPeek(5, 5, 5, stack);

        }
     public static void testMinMaxPeek(int min, int max, int peek, MinMaxStack stack) {
         assert (stack.getMin() == min);
         assert (stack.getMax() == max);
         assert (stack.peek() == peek);
     }
//
    }
     class MinMaxStack {
         List<Map<String,Integer>> minMaxStack = new ArrayList<Map<String,Integer>>(); // minMaxStack.get(minMaxStack.size()-1).get("min");
         List<Integer> stack = new ArrayList<Integer>();

         public int peek() {
             return stack.get(stack.size()-1);
         }

         public int pop() {
             minMaxStack.remove(minMaxStack.size()-1);
             return stack.remove(stack.size()-1);
         }

         public void push(int number) {
             Map<String,Integer> newMinMax = new HashMap<String,Integer>();
             newMinMax.put("min",number);
             newMinMax.put("max",number);
             if(minMaxStack.size() > 0){
                 Map<String,Integer> lastMinMax =
                         new HashMap<String,Integer>(minMaxStack.get(minMaxStack.size()-1));
                 newMinMax.replace("min",Math.min(lastMinMax.get("min"),number));
                 newMinMax.replace("max",Math.max(lastMinMax.get("max"),number));
             }
             minMaxStack.add(newMinMax);
             stack.add(number);
         }

         public int getMin() {
             return minMaxStack.get(minMaxStack.size()-1).get("min");
         }


         public int getMax() {
             return minMaxStack.get(minMaxStack.size()-1).get("max");
         }
     }

