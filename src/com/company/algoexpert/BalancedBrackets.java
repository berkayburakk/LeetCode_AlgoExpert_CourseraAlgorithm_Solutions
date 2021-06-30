package com.company.algoexpert;

import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        String s = "([])(){}(())()()";
        System.out.println(BalancedBrackets(s));

    }
    public static boolean BalancedBrackets(String str) {
        String openinBrackets = "({[";
        String closingBrackets = ")}]";
        Map<Character,Character> matchingBrackets = new HashMap<Character,Character>();
        matchingBrackets.put(')','(');
        matchingBrackets.put('}','{');
        matchingBrackets.put(']','[');

        List<Character> stack = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            //"([])(){}(())()()";
            if(openinBrackets.indexOf(letter) !=-1){
                stack.add(letter);
            } else if(closingBrackets.indexOf(letter) !=-1){
                if(stack.size() ==0){
                    return  false;
                }
                if(stack.get(stack.size()-1) == matchingBrackets.get(letter)){
                    stack.remove(stack.size()-1);
                }
                else{
                    return false;
                }
            }
        }
        return stack.size()==0;
    }

    public static boolean BalancedBrackets2(String str) {
        char[] strChar = str.toCharArray();
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
        Stack<Character> stack = new Stack<>();
        for (Character item : strChar) {
            if (item.equals('(') || item.equals(')') || item.equals('{') || item.equals('}') || item.equals('[') || item.equals(']')) {
                stack.push(item);
            }
            else if(!stack.isEmpty()){
                stack.pop();
            }
            else{
                continue;
            }
        }
        //"([])(){}(())()()";
        while (!stack.isEmpty() && stack != null) {
            char temp = stack.pop();
            if (temp == '(') count1++;
            else if (temp == ')') count4++;
            else if (temp == '[') count2++;
            else if (temp == ']') count5++;
            else if (temp == '{') count3++;
            else if (temp == '}') count6++;

        }
        if (count1 != count4 && count2 != count5 && count6 != count3) {
            return false;
        }
        return true;
    }


    }
