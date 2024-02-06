package com.vladproduction.strategy_is_a;

public class Stack<E> extends MyList<E> {
 public void push(E item) {
 super.addBegin(item);
 }
}