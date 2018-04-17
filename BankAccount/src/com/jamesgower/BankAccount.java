package com.jamesgower;

/**
 * Created by james on 16/05/2017.
 */
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String telNumber;

    public BankAccount(String accountNumber, double balance, String name, String email, String telNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.telNumber = telNumber;
    }

    public BankAccount() {
        this(null, 0, null, null, null);
    }

    public String getAccountNumber() {
        if (accountNumber == null) {
            System.out.println("There is no account number associated with this account");
            return null;
        }
        else {
            System.out.println("The account number is associated with this account is " + accountNumber);
            return accountNumber;
        }
    }

    public void setAccountNumber(String accountNumber) {
        System.out.println("Updated successfully. The registered account number is now " + accountNumber);
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        System.out.println("The balance for this account is £" + balance);
        return balance;
    }

    public void setBalance(double balance) {
        System.out.println("Updated sucessfully. Your balance is now £" + balance);
        this.balance = balance;
    }

    public String getName() {
        if (name == null) {
            System.out.println("There is no name associated with this bank account");
            return null;
        }
        else {
            System.out.println("Updated successfully. The name associated with this account is now " + name);
            return name;
        }
    }

    public void setName(String name) {
        System.out.println("Updated successfully. The name associated with this account is now " + name);
        this.name = name;
    }

    public String getEmail() {
        if (email == null) {
            System.out.println("There is no email associated with this account");
            return null;
        }
        else {
            System.out.println("The email associated with this account is " + email);
            return email;
        }
    }

    public void setEmail(String email) {
        System.out.println("Updated successfully. The email associated with this account is now " + email);
        this.email = email;
    }

    public String getTelNumber() {
        if (telNumber == null) {
            System.out.println("There is no telephone number associated with this account");
            return null;
        }
        else {
            System.out.println("The telephone number associated with this account is " + telNumber);
            return telNumber;
        }
    }

    public void setTelNumber(String telNumber) {
        System.out.println("Updated successfully. The number associated with this account is now " + telNumber);
        this.telNumber = telNumber;
    }

    public double withdrawFunds(double withdrawAmount) {
        double newBalance = balance - withdrawAmount;
        if (newBalance >= 0) {
            System.out.println("Withdrawal successful. Your new balance is £" + newBalance);
            balance = newBalance;
            return newBalance;
        }
        else {
            System.out.println("Withdrawal unsuccessful. You cannot withdraw £" + withdrawAmount + " as you only have £" + balance + ". This withdrawal would but your account balance to £" + newBalance);
            return balance;
        }
    }

    public double depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of £" + depositAmount + " successful. Your new balance is £" + balance);
        return balance;
    }
}
