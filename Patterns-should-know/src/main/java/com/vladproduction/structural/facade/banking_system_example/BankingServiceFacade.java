package com.vladproduction.structural.facade.banking_system_example;

//Facade
public class BankingServiceFacade {

    private String accountNo;
    private String securityCode;
    private AccountVerification accountVerification;
    private SecurityCodeChecker securityCodeChecker;
    private FundsChecker fundsChecker;
    private TransactionLogger transactionLogger;
    private NotificationService notificationService;

    public BankingServiceFacade(String accountNo, String securityCode) {
        this.accountNo = accountNo;
        this.securityCode = securityCode;

        this.accountVerification = new AccountVerification();
        this.securityCodeChecker = new SecurityCodeChecker();
        this.fundsChecker = new FundsChecker();
        this.transactionLogger = new TransactionLogger();
        this.notificationService = new NotificationService();
    }

    public boolean withdraw(double amount) {
        System.out.println("\n=== Starting Withdrawal Process ===");

        if (!accountVerification.verifyAccount(accountNo)) {
            System.out.println("Account verification failed");
            return false;
        }

        if (!securityCodeChecker.validateSecurityCode(securityCode)) {
            System.out.println("Security code validation failed");
            return false;
        }

        if (!fundsChecker.hasSufficientFunds(amount)) {
            System.out.println("Insufficient funds");
            return false;
        }

        fundsChecker.decreaseBalance(amount);
        transactionLogger.logTransaction("Withdrawal", accountNo, amount);
        notificationService.sendNotification(accountNo, "Withdrawal of $" + amount + " processed");

        System.out.println("=== Withdrawal Completed Successfully ===");
        return true;
    }

    public boolean deposit(double amount) {
        System.out.println("\n=== Starting Deposit Process ===");

        if (!accountVerification.verifyAccount(accountNo)) {
            System.out.println("Account verification failed");
            return false;
        }

        if (!securityCodeChecker.validateSecurityCode(securityCode)) {
            System.out.println("Security code validation failed");
            return false;
        }

        fundsChecker.increaseBalance(amount);
        transactionLogger.logTransaction("Deposit", accountNo, amount);
        notificationService.sendNotification(accountNo, "Deposit of $" + amount + " processed");

        System.out.println("=== Deposit Completed Successfully ===");
        return true;
    }

    public double getBalance() {
        System.out.println("\n=== Retrieving Balance ===");
        if (accountVerification.verifyAccount(accountNo) &&
                securityCodeChecker.validateSecurityCode(securityCode)) {
            double balance = fundsChecker.getBalance();
            notificationService.sendNotification(accountNo, "Balance inquiry processed");
            System.out.println("=== Balance Inquiry Completed ===");
            return balance;
        }
        System.out.println("Unable to retrieve balance due to verification failure");
        return -1;
    }

}
