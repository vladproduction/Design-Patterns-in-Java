package com.vladproduction.structural.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Simple component
        Component simple = new ConcreteComponent();
        System.out.println("Simple component: " + simple.operation());

        // Decorated with A
        Component decoratedWithA = new ConcreteDecoratorA(simple);
        System.out.println("Decorated with A: " + decoratedWithA.operation());

        // Access specific method from decorator A
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(simple);
        System.out.println("Additional operation: " + decoratorA.additionalOperation());

        // Decorated with B
        Component decoratedWithB = new ConcreteDecoratorB(simple);
        System.out.println("Decorated with B: " + decoratedWithB.operation());

        // Decorated with B then A
        Component decoratedWithBThenA = new ConcreteDecoratorA(new ConcreteDecoratorB(simple));
        System.out.println("Decorated with B then A: " + decoratedWithBThenA.operation());
    }
}
