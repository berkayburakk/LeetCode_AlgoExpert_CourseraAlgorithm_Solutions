package com.company.leetcode;

class DesignBrowserHistory {

    class Node{
        String url;
        Node prev;
        Node next;
        Node(String url){
            prev=null;
            next=null;
            this.url = url;
        }
    }

    Node current;

    public DesignBrowserHistory(String url) {
        current = new Node(url);

    }
    public void visit(String url) {
        Node newNode = new Node(url);
        current.next = newNode;
        newNode.prev = current;
        current = current.next;

    }

    public String back(int steps) {
        while( current.prev !=null && steps-->0){
            current = current.prev;
        }
        return current.url;
    }

    public String forward(int steps) {
        while(current.next !=null && steps-->0){
            current = current.next;
        }
        return current.url;
    }
}