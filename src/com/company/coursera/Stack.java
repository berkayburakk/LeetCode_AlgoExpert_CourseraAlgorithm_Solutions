package com.company.coursera;

import java.util.Scanner;

public class Stack {

    static int tepe =0;
    static int [] dizi = new int[2];
    static int boyut =2;

    public static int pop(){
        return dizi[--tepe];

    }
    public static void push(int a){
        if(tepe>=boyut){
            int[] dizi2 = new int[boyut*2];
        }
        dizi[tepe++] =a;

    }
    public static void bastir(){
        for (int i = 0; i <tepe ; i++) {
            System.out.println(dizi[i]);
        }
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        bastir();
        System.out.println("Popped "+pop());
        System.out.println("Popped "+pop());


    }


    }

