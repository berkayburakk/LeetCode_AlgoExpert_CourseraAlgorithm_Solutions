package com.company.coursera.Assignment;



import java.util.*;
import java.util.function.Consumer;

public class Week2Assignment {


//There are at least two common ways to efficiently implement a deque: with a modified
// dynamic array or with a doubly linked list.
public static class Deque<Item> implements Iterable<Item> {


    private class Node {
        Item item;
        Node next;
        Node prev;}

        // construct an empty deque
    private int size;
    private Node first;
    private Node last;

    public Deque() {

    }

    // is the deque empty?
    public boolean isEmpty(){
        return first==null;
    }

    // return the number of items on the deque
    public int size(){
        return size;
    }

    // add the item to the front
    public void addFirst(Item item){
        if(item == null) throw new IllegalArgumentException();
        Node newNode = new Node();
        newNode.item = item;
        if(first !=null){
            newNode.next = first;
            first.prev = newNode;

        }
         first = newNode;
        if(last==null) first=null;
        size++;
        // - -

    }

    // add the item to the back
    public void addLast(Item item){
        if(item ==null) throw new IllegalArgumentException();
        Node newNode = new Node();
        newNode.item = item;
        if (last != null) {
            newNode.prev=last;
            last.next = newNode;
        }
        last = newNode;
        if(first==null) first = last;
        size++;
    }

    // remove and return the item from the front
    public Item removeFirst(){
        if(isEmpty()) throw new NoSuchElementException();
        Node oldNode = first;
        first = first.next;

        if(first ==null) last=null;
        else first.prev = null;

        size--;

        return oldNode.item;
    }

    // remove and return the item from the back
    public Item removeLast(){
        if(isEmpty()) throw new NoSuchElementException();
        Node oldNode = last;
        last  = oldNode.prev;

        if(last==null) first=null;
        else last.next = null;

        size--;

        return oldNode.item;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator(){
        return new ItemsIterator();
    }
    private class ItemsIterator implements Iterator<Item>{
        private Node currentNode;

        public ItemsIterator(){
            currentNode = first;
        }

        @Override
        public boolean hasNext() {
            return currentNode !=null;
        }

        @Override
        public Item next() {
            if(currentNode==null){
                throw new NoSuchElementException();
            }
            Item item = currentNode.item;
            currentNode = currentNode.next;

            return item;
        }
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

    // unit testing (required)
    public static void main(String[] args){
        Deque<Integer> deque = new Deque<Integer>();

        //10,5,3,4,6,7
        deque.addFirst(10);
        deque.addLast(5);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(6);
        deque.addLast(7);

        assert (deque.removeFirst() == 10);
        assert (deque.removeLast() ==7);
        assert(deque.isEmpty() ==false);
        assert (deque.first.next.item == 3);
        assert (deque.last.prev.item == 5);

    }
}


//public class RandomizedQueue<Item> implements Iterable<Item> {
//
//// construct an empty randomized queue
//
//    private class Node<Item> {
//        Item item;
//        Node<Item> next;
//        Node<Item> previous;
//    }
//
//        public RandomizedQueue(){
//
//
//        }
//}
//
//        // is the randomized queue empty?
//        public boolean isEmpty()
//
//        // return the number of items on the randomized queue
//        public int size()
//
//        // add the item
//        public void enqueue(Item item)
//
//        // remove and return a random item
//        public Item dequeue()
//
//        // return a random item (but do not remove it)
//        public Item sample()
//
//        // return an independent iterator over items in random order
//        public Iterator<Item> iterator()
//
//        // unit testing (required)
//        public static void main(String[] args)



    }







