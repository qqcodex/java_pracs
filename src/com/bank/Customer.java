package com.bank;

public class Customer {

    String custName;
    String custID;
    BankAccount BA;

    //Constructor
    public Customer(String custName,String custID)
    {
        this.custName = custName;
        this.custID = custID;
    }
}
