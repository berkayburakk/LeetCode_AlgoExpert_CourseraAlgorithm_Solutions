package com.company.coursera;
import java.util.Scanner;
import java.util.Stack;

public class TwoStackAlgorithm {

    public static void main2(String[] args) {

        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        Scanner scanner = new Scanner(System.in);
       // String s = "(1+(2+3)* (4*5)))";

        while(scanner.hasNext()){
            String s= scanner.nextLine();
            if(s.equals("("));
            else if(s.equals("+")) ops.push(s);
            else if(s.equals("*")) ops.push(s);
            else if(s.equals(")")){
                String op = ops.pop();
                if (op.equals("+")) vals.push(vals.pop() + vals.pop());
                else if(op.equals("*")) vals.push(vals.pop()* vals.pop());
            }
            else vals.push(Double.parseDouble(s));
        }
        System.out.println(vals.peek());
        System.out.println(vals.pop());
    }


}
