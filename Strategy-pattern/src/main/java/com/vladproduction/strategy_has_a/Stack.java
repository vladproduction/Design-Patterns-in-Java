package com.vladproduction.strategy_has_a;


public class Stack<E> implements Push<E> {
    MyList<E> list;

    public Stack(MyList<E> list) {
        this.list = list;
    }

    public Stack() {
    }

    @Override
    public void push(E item) {
        list.addBegin(item);
    }

    @Override
    public void setList(MyList<E> list) {
        this.list = list;
    }
}

