package com.vladproduction.structural.decorator;

public abstract class Decorator implements Component{

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        return this.component.operation();
    }
}
