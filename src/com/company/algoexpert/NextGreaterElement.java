package com.company.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int [] array = {6, 4, 5, 7, 2, 1, 3};
        //System.out.println(nextGreaterElement(array));
        for (int i = 0; i < nextGreaterElement(array).length; i++) {
            System.out.println(nextGreaterElement(array)[i]);
        }

    }
    // Solution is true but unfornitely I get timeout error.Oops, your code timed out or ran out of memory.
    //Check for infinite loops or memory leaks.
    // For Example  Case 3 -   "array": [6, 4, 5, 7, 2, 1, 3]
    public static int[] nextGreaterElement(int[] array) {
        int[] arr;
        int n = array.length;
        int index =1;
        ArrayList<Integer> list = new ArrayList<>();
        int [] newArray = new int [n*2];
        for(int i =0;i<n;i++){
            newArray[i] = newArray[n+i] = array[i];
        }
        int max = newArray[0];
        int x = 0;

        while(index < newArray.length){
            if(newArray[index] > max){
                max = Math.max(newArray[index],max);
                for(int j =0;j<index-x;j++){list.add(max);};
                 x = index;
            }
            index++;
            while(index == n){
                if(newArray[index] < max){
                    list.add(-1);
                    index++;
                }
            }
            while(index == n+1 ){
                index=1;
                x=0;
                if(newArray[index] > newArray[x]){
                    max = Math.max(newArray[index], newArray[x] );
                    for (int i = 0; i < index-x; i++) { list.add(max);}
                    if(array[n-1] != array[0]) list.remove(list.size()-1);
                    arr = list.stream().mapToInt(Integer::intValue).toArray();
                    return arr;
                }
            }
        }
        throw new IllegalArgumentException();
    }
    public static int[] nextGreaterElement2(int[] array) {
        Stack<Integer> stack = new Stack<>();

        int result[] = new int[array.length];
        Arrays.fill(result,-1);
        //{2, 5, -3, -4, 6, 7, 2};
        //{-1,-1,-1, -1,-1 -1,-1}
        //n <14

        for(int idx =2  * (array.length-1); idx>=0; idx--){
            int circularIndex = idx % array.length;

            while(stack.size()>0){
                if(array[circularIndex] >= stack.peek()){
                    stack.pop();
                }
                else{
                    result[circularIndex] = stack.peek();
                    break;
                }
            }
            stack.push(array[circularIndex]);
        }

        return result;
    }
    }
