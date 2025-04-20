package com.vladproduction.structural.facade.banking_system_example;

public class FundsChecker {

    private double balance = 1000.0;

    public boolean hasSufficientFunds(double amount) {
        System.out.println("Checking if account has sufficient funds: $" + amount);
        return balance >= amount;
    }

    public void decreaseBalance(double amount) {
        balance -= amount;
        System.out.println("Balance after withdrawal: $" + balance);
    }

    public void increaseBalance(double amount) {
        balance += amount;
        System.out.println("Balance after deposit: $" + balance);
    }

    public double getBalance() {
        return balance;
    }

}
