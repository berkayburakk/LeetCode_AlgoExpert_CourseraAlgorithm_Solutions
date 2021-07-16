package com.company.algoexpert;

public class RemoveDupLinkedList {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {

        LinkedList currentNode = linkedList;
        if(linkedList== null) return linkedList;

        while(currentNode != null){
            LinkedList nextDistinct = currentNode.next;
            while(nextDistinct !=null && nextDistinct.value == currentNode.value){
                nextDistinct = nextDistinct.next;
            }
            currentNode.next = nextDistinct;
            currentNode = nextDistinct;

        }

        return linkedList;
    }
}
