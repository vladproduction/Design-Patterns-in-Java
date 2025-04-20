package com.vladproduction.structural.decorator;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public String operation() {
        return "ConcreteDecoratorA (" + super.operation() + ");";
    }

    public String additionalOperation() {
        return "Additional Operation from ConcreteDecoratorA;";
    }
}
