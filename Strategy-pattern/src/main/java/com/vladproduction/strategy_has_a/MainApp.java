package com.vladproduction.strategy_has_a;

public class MainApp {
    public static void main(String[] args) {

        MyList<Integer> list = new MyList<>();
        list.setSq(new Queue<Integer>());
        for (int i = 0; i < 10; i++)
            list.push(i);
        System.out.println(list);
        list.setSq(new Stack<Integer>());
        for (int i = 0; i < 10; i++)
            list.push(i);
        System.out.println(list);
        while(!list.isEmpty()){
            list.pop();
            System.out.println(list);
        }
    }
}
