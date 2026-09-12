package com.bank;

public class BankAccount {

    final String accountNumber;
    double accountBalance;

    public BankAccount(String accountNumber,double initialBalance)
    {
        this.accountNumber = accountNumber;
        if (initialBalance > 0)
        {
            System.out.print("Account balance: $ "+initialBalance);
        }
        this.accountBalance = initialBalance;
    }

}
