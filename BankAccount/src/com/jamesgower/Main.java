package com.jamesgower;

/**
 * Created by james on 16/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        BankAccount jamesAccount = new BankAccount();
        jamesAccount.setBalance(100);
        jamesAccount.withdrawFunds(100);
        jamesAccount.withdrawFunds(1);
        jamesAccount.depositFunds(100);
        jamesAccount.withdrawFunds(101);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        VipCustomer person2 = new VipCustomer("Jim", 2300, "lol@lol.com");
        System.out.println(person2.getName());
        VipCustomer person3 = new VipCustomer("Bill", 2000);
        System.out.println(person3.getEmail());
    }
}
