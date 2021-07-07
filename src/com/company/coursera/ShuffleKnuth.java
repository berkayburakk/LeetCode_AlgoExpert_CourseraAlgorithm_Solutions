package com.company.coursera;

import java.util.Scanner;

public class ShuffleKnuth {

    public static void shuffle(Object[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            // choose index uniformly in [0, i]
            int r = (int) (Math.random() * (i + 1));
            Object swap = a[r];
            a[r] = a[i];
            a[i] = swap;
        }
    }
    public static void shuffleAlternate(Object[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            // choose index uniformly in [i, n-1]
            int r = i + (int) (Math.random() * (n - i));
            Object swap = a[r];
            a[r] = a[i];
            a[i] = swap;
        }
    }
    public static void main(String[] args) {
        int numberItem; String a[];
        Scanner in = new Scanner(System.in);
        numberItem = in.nextInt();
        in.nextLine();

        a = new String[numberItem];

        for (int i = 0; i < a.length; i++){
            a[i] = in.nextLine();

        }
        ShuffleKnuth.shuffle(a);


    }
}
