package com.vladproduction.strategy_has_a;

public interface Push<E> {
    void push(E item);

    void setList(MyList<E> list);
}
