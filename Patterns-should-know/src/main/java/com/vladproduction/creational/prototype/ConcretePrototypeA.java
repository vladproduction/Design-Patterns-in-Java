package com.vladproduction.creational.prototype;

public class ConcretePrototypeA implements Prototype {

    private String fieldA;

    public ConcretePrototypeA(String fieldA) {
        this.fieldA = fieldA;
    }

    // Copy constructor
    public ConcretePrototypeA(ConcretePrototypeA prototype) {
        this.fieldA = prototype.fieldA;
    }

    public String getFieldA() {
        return fieldA;
    }

    public void setFieldA(String fieldA) {
        this.fieldA = fieldA;
    }

    @Override
    public Prototype copy() {
        return new ConcretePrototypeA(this);
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA with fieldA = " + fieldA;
    }
}
