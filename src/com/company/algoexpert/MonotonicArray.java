package com.company.algoexpert;

public class MonotonicArray {

    public static void main(String[] args) {

        int[] n = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        isMonotonic(n);
    }

    public static boolean isGreaterOrLower(int[] array){
        int lastElement = array[array.length-1];
        int firstElement = array[0];
        if(firstElement > lastElement){
            return false;
        }
        else if(lastElement>firstElement){
            return true;
        }

        return false;

    }
    public static boolean isMonotonic(int[] array) {
        if(array.length <=2) return true;

        boolean isMonotonic = false;
        for(int i =1; i < array.length; i++){
            if(isGreaterOrLower(array) == true){
                if(array[i-1] <= array[i]){
                    isMonotonic = true;
                }
                else{
                    return false;
                }
            }
            else if(isGreaterOrLower(array) ==false){
                if(array[i-1] >= array[i]){
                    isMonotonic = true;
                }
                else{
                    return false;
                }
            }
        }

        // Write your code here.
        return isMonotonic;
    }
}
