package com.company.coursera;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {5,7,2,9,6,1,3};
        bubleSort(arr);
        print(arr);


    }
    static void bubleSort(int [] array){

        for (int i = 0; i < array.length-1; i++) {
            int sirali = 1;
            for (int j = i+1; j < array.length; j++) {
                sirali = 0;
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            if(sirali==1) break;
        }
    }
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" .element");
        }
    }
}
