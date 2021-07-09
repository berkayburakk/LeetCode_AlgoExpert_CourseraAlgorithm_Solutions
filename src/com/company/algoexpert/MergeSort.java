package com.company.algoexpert;

public class MergeSort {

    private static void exch(Object[] a, int i,int j){

        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static boolean less(int i,int j){
        int val;
        if(i ==j) val = 0;
        else if(i < j) val =-1;
        else val =1;
        return val ==-1;
    }

    private static void merge(int[] a,int[] aux, int lo, int mid, int hi){

        for(int k = lo; k <= hi; k++){
            aux[k] = a[k];
        }
        int i = lo;
        int j = mid+1;
        for(int k = lo; k <= hi; k++){

            if			(i > mid) 		    a[k] = aux[j++];
            else if		(j > hi)			a[k] = aux[i++];
            else if(less(aux[j],aux[i]))    a[k] = aux[j++];
            else 							a[k] = aux[i++];
        }
    }
    private static void sort(int[] a,int[] aux, int lo, int hi){

        if(hi <=lo) return;

        int mid = lo + (hi-lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        merge(a, aux, lo, mid, hi);
    }
    private static void sort(int[] a){
        int[] aux = new int[a.length];
        sort(a,aux,0,a.length-1);
    }

    public static int[] mergeSort(int[] array) {
        sort(array);
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5,1,0,6,2,34,5,77,2,1,56};
        sort(array);
        for(int i : array){
            System.out.println(i);
        }
    }

}
