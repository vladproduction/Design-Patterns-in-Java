package com.vladproduction.strategy_is_a;

public class MyList<E> {

    class Node<E> {
        E item;
        Node<E> next;

        public Node() {
        }

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    Node<E> head;
    Node<E> tail;

    public MyList() {
        head = null;
        tail = null;
    }

    public void addBegin(E item) {
        Node<E> h = new Node<>(item, null);
        if (head == null) tail = head = h;
        else {
            h.next = head;
            head = h;
        }
    }

    public void addEnd(E item) {
        Node<E> h = new Node<>(item, null);
        if (head == null) tail = head = h;
        else {
            tail.next = h;
            tail = h;
        }
    }

    public E getItemBegin() {
        if (head == null) return null;
        else return head.item;
    }

    public E pop() {
        if (head == null) return null;
        else {
            E h = head.item;
            head = head.next;
            return h;
        }
    }

    public void push(E item) {
        addEnd(item);
    }

    public boolean isEmpty() {
        return (head == null) ? true : false;
    }

    @Override
    public String toString() {
        String s = "";
        for (Node<E> h = head; h != null; h = h.next) {
            s += " " + h.item;
        }
        return s;
    }
}
