package com.pankaj.ds;

public class Node<T> {
    private Node<T> next;
    private T data;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> node) {
        this.next = node;
    }

    public T getData() {
        return this.data;
    }
}
