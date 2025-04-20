package com.vladproduction.behavioral.strategy;

public class BitcoinPayment implements PaymentStrategy {

    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Bitcoin.");
    }

}
