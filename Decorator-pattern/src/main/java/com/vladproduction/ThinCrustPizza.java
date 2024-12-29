package com.vladproduction;

public class ThinCrustPizza extends Pizza{

    public ThinCrustPizza() {
        description = "ThinCrustPizza";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
