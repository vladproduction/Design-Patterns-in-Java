package com.vladproduction.demo;

public class Main {
    public static void main(String[] args) {
        Strategy strategyA = new ConcreteStrategyA();
        Strategy strategyB = new ConcreteStrategyB();

        Context context = new Context(strategyA);
        context.executeStrategy(); // Output: Executing strategy A

        context.setStrategy(strategyB);
        context.executeStrategy(); // Output: Executing strategy B
    }
}
