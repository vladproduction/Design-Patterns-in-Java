package com.vladproduction.strategy_has_a;

public class MyList<E> {

    Push<E> sQ;

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
        sQ.push(item);
    }

    public void setSq(Push<E> sq) {
        sQ = sq;
        sQ.setList(this);
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
