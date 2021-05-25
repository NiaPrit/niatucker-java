package com.techelevator;

public class BankAccount {
 // Attributes
  private String accountHolderName;
  private String accountNumber;
  private int    balance;
//Methods
    public int deposit(int amountToDeposit) {
        balance = amountToDeposit + balance;
        return balance;
    }
    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        return balance;
    }

  //Constructor
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String accountHolderName, String accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //getters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
