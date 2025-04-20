package com.vladproduction.structural.decorator.coffee_example;

public class CoffeeShopDemo {
    public static void main(String[] args) {
        // Order a simple coffee
        Coffee coffee = new SimpleCoffee();
        printCoffee(coffee);

        // Decorate with milk
        coffee = new MilkDecorator(coffee);
        printCoffee(coffee);

        // Add sugar
        coffee = new SugarDecorator(coffee);
        printCoffee(coffee);

        // Add whipped cream
        coffee = new CreamedDecorator(coffee);
        printCoffee(coffee);

        System.out.println("\nAnother order:");
        // Create a coffee with milk and whipped cream directly
        Coffee anotherCoffee = new CreamedDecorator(new MilkDecorator(new SimpleCoffee()));
        printCoffee(anotherCoffee);


    }

    private static void printCoffee(Coffee coffee) {
        System.out.println("Description: " + coffee.getDescription() +
                " | Cost: $" + coffee.getPrice());
    }

}
