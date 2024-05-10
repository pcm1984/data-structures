package com.pankaj.ds.linkedlist;

public class MyLinkedList<T> {
    private Node<T> start;
    private int size;

    public MyLinkedList(){
        this.start = null;
        this.size = 0;
    }

    //Method to add new Node at the end of the linkedList
    public void add(T data){
        Node<T> node = new Node<>(data);
        if(start == null){
            start = node;
        }else{
            Node<T> temp = start;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        size++;
    }
    // Method to get the size of the linked list
    public int getSize() {
        return size;
    }

    // Method to check if the linked list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to print the elements of the linked list
    public void traverse() {
        Node<T> temp = start;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    // Method to add a new element at the beginning of the linked list
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(start);
        start = newNode;
        size++;
    }

    // Method to remove the first occurrence of a specified element from the linked list
    public void remove(T data) {
        if (start == null) {
            return;
        }
        if (start.getData().equals(data)) {
            start = start.getNext();
            size--;
            return;
        }
        Node<T> temp = start;
        while (temp.getNext() != null) {
            if (temp.getNext().getData().equals(data)) {
                temp.setNext(temp.getNext().getNext()) ;
                size--;
                return;
            }
            temp = temp.getNext();
        }
    }

}