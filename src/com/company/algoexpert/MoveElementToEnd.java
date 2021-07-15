package com.company.algoexpert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MoveElementToEnd {

    public static void main(String[] args) {
        List<Integer> arr = new LinkedList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        moveElementToEnd(arr,3);


    }
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {

        // [ 2,1,2,2,2,3,4,2]
        // [ 1,3,4,2,2,2,2,2]
       int nonMoveIdx = 0;

        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) !=toMove){
                array.set(nonMoveIdx,array.get(i));
                nonMoveIdx++;
            }
        }

        while(nonMoveIdx < array.size()){
            array.set(nonMoveIdx,toMove);
            nonMoveIdx++;
        }

        return array;
    }
    public static List<Integer> moveElementToEnd2(List<Integer> array , int toMove){

        for(int i =0,j=0; i<array.size(); i++)
        {
            if(array.get(i) !=toMove)
            {
                int temp =  array.get(j);
                array.set(j,array.get(i));
                array.set(i,temp);
                j++;
            }
        }

        return array;
    }
}
