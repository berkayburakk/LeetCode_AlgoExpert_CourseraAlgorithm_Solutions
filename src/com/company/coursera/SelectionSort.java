package com.company.coursera;

public class SelectionSort {
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.selectionSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public void selectionSort(int [] array){
        int j,i;
        int n = array.length;

        for ( i = 0; i <array.length-1; i++) {
            int minIdx = i;
            for (j = i+1; j < array.length; j++) {
                if(array[j] < array[minIdx]){
                    minIdx = j;
                }
            }

            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }

    }


}
