package com.company.coursera;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Queue<Item> implements Iterable<Item> {

    private Node<Item> first;
    private Node<Item> last;
    private int n;

    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }
    public Queue(){
        first =null;
        last=null;
        n=0;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public int size(){
        return n;
    }
    public Item peek(){
        if(isEmpty()) throw new NoSuchElementException();
        return first.item;
    }
    public void enqueue(Item item) {
        //Enqeue Push ile aynı sadece burdaki fark kuyruk
        //oldLast isminde eskiden gelen son değeri tutacak
        Node<Item> oldLast = last; // Last'ı değiştireceğimiz için yedekte tutuyoruz.
        last = new Node<Item>(); //last içinn yeni Node oluştururyourz.
        last.item = item; //last'in ilk itemi bize parametre olarak gelen item değeri
        last.next = null; //bir sonraki değer belli olmadığı için null olarak set ediyoruz.
        if(isEmpty()) first=last; // eğer queue boş ise ilk eleman son elemana eşitliyoruz
        else oldLast.next = last; // eğer boş değilse oldLastin bir sonraki elemannı last olarak ekliyoruz
        n++; // boyutu bir arttırıyoruz
    }
    public Item dequeue(){
        if(isEmpty()) throw new NoSuchElementException("Queue underflow...");
        Item item = first.item;
        first = first.next;
        n--;
        if(isEmpty()) last =null;
        return item;
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this) {
            s.append(item);
            s.append(' ');
        }
        return s.toString();
    }

    public Iterator<Item> iterator()  {
        return new LinkedIterator(first);
    }
    private class LinkedIterator implements Iterator<Item> {
        private Queue.Node<Item> current;

        public LinkedIterator(Queue.Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new Queue<String>();
        while (scanner.hasNext()) {
            String item = scanner.nextLine();
            if (!item.equals("-"))
                queue.enqueue(item);
            else if (!queue.isEmpty())
                System.out.print(queue.dequeue() + " ");
        }
        System.out.println("(" + queue.size() + " left on queue)");
    }




}

