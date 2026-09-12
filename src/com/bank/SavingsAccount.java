package com.bank;

public class SavingsAccount extends BankAccount{

    double interestRatePA;

    public SavingsAccount(String accountNumber, double accountBalance, double interestRatePA)
    {
        super(accountNumber, accountBalance);
        this.interestRatePA = interestRatePA;
    }
}



