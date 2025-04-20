package com.vladproduction.behavioral.state;

public class StateDemo {
    public static void main(String[] args) {
        Package pkg = new Package("ABC123");

        // Initial state
        System.out.println(pkg.getStatus());

        // Move to next state
        pkg.nextState();
        System.out.println(pkg.getStatus());

        // Move to next state
        pkg.nextState();
        System.out.println(pkg.getStatus());

        // Move back to previous state
        pkg.previousState();
        System.out.println(pkg.getStatus());

        // Move forward twice
        pkg.nextState();
        pkg.nextState();
        System.out.println(pkg.getStatus());

        // Try to move forward in final state
        pkg.nextState();
    }
}
