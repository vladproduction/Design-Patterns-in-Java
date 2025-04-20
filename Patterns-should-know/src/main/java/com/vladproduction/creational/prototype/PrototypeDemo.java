package com.vladproduction.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {

        //create prototype registry:
        PrototypeRegistry registry = new PrototypeRegistry();

        //create concrete prototypes A & B (initial prototypes)
        ConcretePrototypeA prototypeA = new ConcretePrototypeA("Original A");
        registry.addPrototype("A", prototypeA);

        ConcretePrototypeB prototypeB = new ConcretePrototypeB("Original B");
        registry.addPrototype("B", prototypeB);

        // Clone and use prototypes A
        ConcretePrototypeA cloneA = (ConcretePrototypeA)registry.getPrototype("A");
        System.out.println("Original A: " + prototypeA);
        System.out.println("Cloned A: " + cloneA);

        //modify clone:
        cloneA.setFieldA("Modified clone of A");
        System.out.println("After modified clone of A: ");
        System.out.println("Original A: " + prototypeA);
        System.out.println("Cloned A: " + cloneA);

        // Clone and use prototypes B
        ConcretePrototypeB cloneB = (ConcretePrototypeB) registry.getPrototype("B");
        System.out.println("Original B: " + prototypeB);
        System.out.println("Cloned B: " + cloneB);

    }
}
