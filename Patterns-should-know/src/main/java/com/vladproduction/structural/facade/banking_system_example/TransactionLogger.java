package com.vladproduction.structural.facade.banking_system_example;

public class TransactionLogger {

    public void logTransaction(String transactionType, String accountNo, double amount) {
        System.out.println("Logging transaction: " + transactionType +
                " for account " + accountNo +
                " amount: $" + amount);
    }

}
