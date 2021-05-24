package com.techelevator;

public class SavingsAccount extends BankAccount {
    public SavingsAccount (String accountHolderName, String accountNumber){
    super(accountHolderName,accountNumber);
    }

    public SavingsAccount (String accountHolderName, String accountNumber, int balance){
        super(accountHolderName,accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw) {
        // if amount to withdraw is more than current balance in the acct no withdraw will happen && no fees
        if (amountToWithdraw > super.getBalance() || amountToWithdraw < 0) {
            return super.getBalance();
        }
        //  if balance is less than 150 and additional charge of 2 dollars will happen
        // get the balance from the bank account

        // if the balance is more than 150 then just draw the money no fees
        if (super.getBalance() > 150){
            super.withdraw(amountToWithdraw);
        }
        // compare balance from bank acct to see if its less than 150
        // if it is add 2 dollars to the withdraw amount
        if (super.getBalance() < 150) {
            super.withdraw(2);
        }


        // return the balance
        return super.getBalance();

    }

}
