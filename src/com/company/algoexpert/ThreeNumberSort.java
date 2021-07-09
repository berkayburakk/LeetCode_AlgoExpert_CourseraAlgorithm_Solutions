package com.company.algoexpert;

public class ThreeNumberSort {
    public static void main(String[] args) {

    }
    public int[] threeNumberSort(int[] array, int[] order) {

        if(array.length==0)
            return new int[] {};
        int first_count =0,second_count=0,third_count=0;

        for(int i =0;i<array.length;i++){
            if(array[i] == order[0]) first_count++;
            else if(array[i] == order[1]) second_count++;
            else if(array[i] == order[2]) third_count++;
        }
        for(int x =0 ; x<first_count;x++){
            array[x]  = order[0];
        }
        for(int y =first_count; y<first_count+second_count;y++){
            array[y]  = order[1];
        }
        for(int z =first_count+second_count ; z<first_count+second_count+third_count;z++){
            array[z]  = order[2];
        }

        return array;
    }

    public int[] threeNumberSort2(int[] array, int[] order) {
        int[] valueCounts = new int[]{0,0,0};

        for (int element: array) {
            int orderIdx = getIndex(order,element);
            valueCounts[orderIdx] = valueCounts[orderIdx]+1;
        }
        for (int i = 0; i < 3; i++) {
            int value = order[i];
            int count = valueCounts[i];

            int numElementsBefore = getSum(valueCounts,i);
            for (int n = 0; n < count; n++) {
                int currentIdx = numElementsBefore +n;
                array[currentIdx] = value;
            }
        }
        return array;
    }
    public int getIndex(int[] array, int element){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == element)
                return i;
        }
        return -1;
    }
    public int getSum(int[] array, int end){
        int sum=0;
        for (int i = 0; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
