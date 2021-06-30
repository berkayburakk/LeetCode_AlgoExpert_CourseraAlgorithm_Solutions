package com.company.leetcode;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matriks= {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        System.out.println(diagonalSum(matriks));
    }
    public static int diagonalSum(int[][] mat) {
        int toplam = 0;
        int sagdan_sola_toplam=0;
        int soldan_sağa_toplam =0;
        int yatay = 0,dikey=0,tersDikey=0,tersYatay=mat.length-1;
        int sinir = mat.length;
        while(yatay<sinir && dikey<sinir && tersYatay>=0 && tersDikey<sinir){
            soldan_sağa_toplam +=mat[yatay][dikey];
            sagdan_sola_toplam +=mat[tersDikey][tersYatay];
            if(yatay==dikey && tersDikey==tersYatay){
                soldan_sağa_toplam -=mat[yatay][dikey];
            }
            yatay++;
            dikey++;
            tersDikey++;
            tersYatay--;
        }
        toplam +=sagdan_sola_toplam;
        toplam +=soldan_sağa_toplam;
        return toplam;
    }
}
