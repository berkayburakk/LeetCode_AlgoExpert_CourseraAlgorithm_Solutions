package com.company.algoexpert;

public class FindThreeLargestNumbers {
    public static void main(String[] args) {
        int [] n = {141,1,17,-7,-17,-27,18,541,8,7,7};
        System.out.println(findThreeLargestNumbers(n));
    }

    public static int[] findThreeLargestNumbers(int[] array) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax =Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        int i =0;
        int k = array.length;
        if(array.length ==0) return new int [] {};

        while(i<k){
            int curr = array[i];

            if(firstMax < curr){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = curr;
            }
            else if (secondMax < curr){
                int temp = secondMax;
                secondMax = curr;
                thirdMax = temp;
            }
            else if(thirdMax < curr ){
                thirdMax = curr;
            }
            i++;
        }
        int[] values = new int[3];
        values[0] = thirdMax; values[1]= secondMax; values[2] = firstMax;





        return values;
    }
}
