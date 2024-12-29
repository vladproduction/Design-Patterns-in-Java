package com.vladproduction;

public class PizzaStoreApp {
    public static void main(String[] args) {

        //create pizza
        Pizza thinPizza = new ThinCrustPizza();
        System.out.println("My pizza: " + thinPizza.getDescription() + ", cost: " + thinPizza.cost() + "$");
        //My pizza: ThinCrustPizza, cost: 7.99$

        //add topic for thinPizza
        //cheese ( +1.50 $ )
        thinPizza = new Cheese(thinPizza);
        System.out.println("My pizza: " + thinPizza.getDescription() + ", cost: " + thinPizza.cost() + "$");
        //My pizza: ThinCrustPizza, Cheese, cost: 9.49$


        //add topic for thinPizza
        //olive ( +0.70 $ )
        thinPizza = new Olive(thinPizza);
        System.out.println("My pizza: " + thinPizza.getDescription() + ", cost: " + thinPizza.cost() + "$");
        //My pizza: ThinCrustPizza, Cheese, Olive, cost: 10.19$

        Pizza thickPizza = new ThickCrustPizza();
        thickPizza = new Pepper(thickPizza);
        System.out.println("My pizza: " + thickPizza.getDescription() + ", cost: " + thickPizza.cost() + "$");
        //My pizza: ThickCrustPizza, Pepper, cost: 10.49$


    }
}
