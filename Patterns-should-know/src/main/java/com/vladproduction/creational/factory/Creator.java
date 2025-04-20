package com.vladproduction.creational.factory;

public abstract class Creator {

    //Factory method:
    public abstract Product createProduct();

    //Template method that used that factory:
    public void someOperation() {
        Product product = createProduct();
        product.operation();
    }

}
