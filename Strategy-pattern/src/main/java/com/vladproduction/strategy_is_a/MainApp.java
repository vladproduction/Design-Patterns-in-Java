package com.vladproduction.strategy_is_a;

public class MainApp {
    public static void main(String[] args) {
//        MyList<Integer> list = new Stack<>();
        MyList<Integer> list = new Queue<>();
        for (int i = 0; i < 10; i++) list.push(i);
        System.out.println(list);
        while(!list.isEmpty()){
            list.pop();
            System.out.println(list);
        }
    }
}

/*
*
* MyList<Integer> list = new Stack<>();
* The first line displays, starting from the head of the list, all elements
hit the stack. Next, one element is removed from the stack and printed
the contents of the stack, until the contents of the stack run out. Result
work complies with the LIFO principle (last in - first out, “last to come -
came out first").
*
* MyList<Integer> list = new Queue<>();
* The results of the above program will correspond to
operating principle of FIFO (first in - first out, “first in - first out”).
* */
