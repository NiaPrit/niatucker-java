package com.techelevator;

import java.util.ArrayList;
import java.util.List;

/**
 * BankCustomer
 */
public class BankCustomer {
// Attributes from the readme both getters/setters
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();   // List of Accountable objects

//Methods
// add newAccount to the customers list of accounts
// add vip method when a customers combined balance is least 25,000\
// if customer as debt (cc) minus the debt the account balance has to be atleast 25,00



//getters&setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Object[]  getAccounts() {
        return accounts.toArray();

    }
    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    public boolean isVip() {
        int totalbalance = 0;
        for (int i = 0; i < accounts.size(); i++) {
            totalbalance = totalbalance + accounts.get(i).getBalance();
        }
        if (totalbalance >= 25000) {
            return true;
        }
        return false;
    }

}