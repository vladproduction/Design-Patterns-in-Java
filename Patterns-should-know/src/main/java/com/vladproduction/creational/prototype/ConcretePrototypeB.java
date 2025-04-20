package com.vladproduction.creational.prototype;

public class ConcretePrototypeB implements Prototype {

    private String fieldB;

    public ConcretePrototypeB(String fieldB) {
        this.fieldB = fieldB;
    }

    public ConcretePrototypeB(ConcretePrototypeB prototypeB) {
        this.fieldB = prototypeB.fieldB;
    }

    public String getFieldB() {
        return fieldB;
    }

    public void setFieldB(String fieldB) {
        this.fieldB = fieldB;
    }

    @Override
    public Prototype copy() {
        return new ConcretePrototypeB(this);
    }

    @Override
    public String toString() {
        return "ConcretePrototypeB with fieldB = " + fieldB;
    }
}
