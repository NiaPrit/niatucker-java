package com.techelevator;

/**
 * CreditCardAccount
 */
public class CreditCardAccount implements Accountable {
	
/*******************************************************************
 * Place the code for  your CreditCard class here
 *******************************************************************/
// Attributes

private String accountHolder; // returns the account holder name that the acct belong too
private String accountNumber; // returns the account number the acct belongs to
private int     debt;          // returns the amount the customer owes

//Methods
// removes( subtract) amountToPay from the amount owed (debt)

  public int pay(int amountToPay) {
    debt = debt - amountToPay;
            return debt;
  }
  public int charge(int amountToCharge) {
      debt = amountToCharge + debt;
      return debt;
  }

//Constructor
    public CreditCardAccount(String accountHolder, String accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.debt =   debt;
    }

    public int getBalance() {
    	//***************************************************************
    	// This should return the negative of the debt data member
    	//***************************************************************
    	
        return -debt;
    }

 //getters

    public String getAccountNumber() {
        return accountNumber;
}
    public String getAccountHolder() {
        return accountHolder;
    }
    public int getDebt(){
        return debt;
    }
}