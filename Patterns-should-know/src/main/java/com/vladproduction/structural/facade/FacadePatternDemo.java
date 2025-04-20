package com.vladproduction.structural.facade;

// Client code
public class FacadePatternDemo {
    public static void main(String[] args) {

        ComputerFacade computer = new ComputerFacade();
        
        // Start the computer using the simplified facade
        computer.start();
        
        // ... use the computer ...
        System.out.println("\nComputer is running...\n");
        
        // Shut down the computer using the simplified facade
        computer.shutdown();

    }

}