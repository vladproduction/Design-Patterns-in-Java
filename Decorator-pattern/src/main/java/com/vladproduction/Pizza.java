package com.vladproduction;

public abstract class Pizza {

    String description = "Unknowing pizza";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
