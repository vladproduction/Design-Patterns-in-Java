package com.vladproduction;

public class ThickCrustPizza extends Pizza{

    public ThickCrustPizza() {
        description = "ThickCrustPizza";
    }

    @Override
    public double cost() {
        return 9.99;
    }
}
