package com.company.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static void main(String[] args) {

    }

    public static List<Integer> spiralTraverse(int[][] array) {

        if(array.length ==0) return new ArrayList<Integer>();
        List<Integer> list = new ArrayList<>();
        int n = array.length;
        int satirBas = 0;
        int satirSon = n-1;
        int sutunBas = 0;
        int sutunSon = array[0].length-1;


        while(satirBas <= satirSon && sutunBas <= sutunSon){
            for(int i =sutunBas; i <= sutunSon; i++ ){
                list.add(array[satirBas][i]);
            }
            //1 2 3 4
            for(int i = satirBas+1 ; i <= satirSon ; i++){
                list.add(array[i][sutunSon]);
            }
            //1 2 3 4 5 6 7

            for(int i =sutunSon-1 ; i >=sutunBas; i-- ){
                if(satirBas == satirSon) break;
                list.add(array[satirSon][i]);
            }
            for(int i =satirSon-1 ; i > satirBas; i-- ){
                if(sutunBas == sutunSon) break;
                list.add(array[i][sutunBas]);
            }
            sutunBas++;
            sutunSon--;
            satirBas++;
            satirSon--;
        }

        return list;
    }
}
