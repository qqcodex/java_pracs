package com.bank;

public class CurrentAccount extends BankAccount{

    double interestRatePA;

    public CurrentAccount(String accountNumber, double accountBalance, double interestRatePA)
    {

        super(accountNumber, accountBalance);
        this.interestRatePA = interestRatePA;
    }
}
