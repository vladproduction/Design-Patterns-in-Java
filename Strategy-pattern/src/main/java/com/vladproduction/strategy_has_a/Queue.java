package com.vladproduction.strategy_has_a;

public class Queue<E> implements Push<E> {
    MyList<E> list;

    public Queue(MyList<E> list) {
        this.list = list;
    }

    public Queue() {
    }

    @Override
    public void push(E item) {
        list.addEnd(item);
    }

    @Override
    public void setList(MyList<E> list) {
        this.list = list;
    }
}
