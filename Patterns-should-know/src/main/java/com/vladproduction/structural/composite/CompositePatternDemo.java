package com.vladproduction.structural.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        // Create a tree structure
        Composite root = new Composite("Root");
        Composite branch1 = new Composite("Branch 1");
        Composite branch2 = new Composite("Branch 2");

        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");
        Leaf leaf3 = new Leaf("Leaf 3");

        // Build the tree
        root.add(branch1);
        root.add(branch2);

        branch1.add(leaf1);
        branch2.add(leaf2);
        branch2.add(leaf3);

        // Execute operations
        System.out.println("Operation on root:");
        root.operation();

        System.out.println("\nOperation on branch1:");
        branch1.operation();

        System.out.println("\nOperation on leaf3:");
        leaf3.operation();

        // Try adding to a leaf
        leaf1.add(new Leaf("Impossible Leaf"));
    }
}
