package com.devon;

public class Main {

    public static void main(String[] args) {
	    BankAccount newAccount = new BankAccount();
	    newAccount.withdraw(20.00);
	    newAccount.deposit(125.25);
        System.out.println(newAccount.getBalance());
        BankAccount anotherAccount = new BankAccount();
        System.out.println(anotherAccount.getAccountNumber());
    }
}
