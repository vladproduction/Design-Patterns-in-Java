package com.vladproduction.structural.facade.banking_system_example;

//Client code
public class BankingDemo {
    public static void main(String[] args) {

        // Create a banking facade for a customer
        BankingServiceFacade bankService = new BankingServiceFacade("123456789", "1234");
        // Check the initial balance
        System.out.println("Current Balance: $" + bankService.getBalance());

        // Withdraw some money
        bankService.withdraw(500);

        // Check the balance after withdrawal
        System.out.println("Current Balance: $" + bankService.getBalance());

        // Deposit some money
        bankService.deposit(300);

        // Check the final balance
        System.out.println("Current Balance: $" + bankService.getBalance());
    }
}
