package com.company.coursera;
import java.util.*;
public class Knuth{
    private Knuth(){}

    public static void Shuffle(Object[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = (int)(Math.random() * (i+1));
            Object swap = a[r];
            a[r] = a[i];
            a[i] = swap;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sequence with spaces e.g. 1 3 5 3 1 1 3 5 ");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        String[] myWords;

        for (int i = 0; i < 10; i++) {
            Knuth.Shuffle(words);
        }
        int rnd = new Random().nextInt(words.length);
        System.out.println(words[rnd]);
    }
}

