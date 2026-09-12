package com.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    // States
    final String bankName;
    final List<Customer> customerList = new ArrayList<>();
    // Constructor
    public Bank(String bankName){
        this.bankName = bankName;
    }

}
