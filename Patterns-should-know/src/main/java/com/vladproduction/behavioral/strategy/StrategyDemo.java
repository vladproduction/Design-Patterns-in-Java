package com.vladproduction.behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // User selects credit card payment
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe", "123", "12/25"));
        cart.checkout(100);

        // User selects PayPal payment
        cart.setPaymentStrategy(new PayPalPayment("john@example.com", "password"));
        cart.checkout(200);

        // User selects Bitcoin payment
        cart.setPaymentStrategy(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        cart.checkout(300);
    }
}
