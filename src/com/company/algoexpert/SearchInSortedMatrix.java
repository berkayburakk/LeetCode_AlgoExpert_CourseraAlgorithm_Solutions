package com.company.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] n ={
            {1, 4, 7, 12, 15, 1000},
            {2, 5, 19, 31, 32, 1001},
            {3, 8, 24, 33, 35, 1002},
            {40, 41, 42, 44, 45, 1003},
            {99, 100, 103, 106, 128, 1004}
    };
        searchInSortedMatrix(n,44);

    }

    public static int[] searchInSortedMatrix(int[][] matrix, int target) {

        int col = matrix[0].length-1;
        int row = 0;
        // [0][5]
        while(col >= 0 && row < matrix.length){

            if(matrix[row][col] > target--){
                col--;
            }
            else if(matrix[row][col] < target){
                row++;
            }
            else{
                return new int [] {row,col};
            }
        }
        return new int[] {-1, -1};
    }
}
