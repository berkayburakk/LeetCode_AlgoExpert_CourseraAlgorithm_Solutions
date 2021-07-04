package com.company.leetcode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;



class ImplementStackUsingQueues{

    Queue<Integer> queue= new LinkedList<Integer>();
    /** Initialize your data structure here. */
    public ImplementStackUsingQueues() {}

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        int n = queue.size();

        while (n > 1){
            queue.add(queue.poll());
            n--;
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
