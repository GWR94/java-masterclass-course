package com.jamesgower;

/**
 * Created by james on 16/05/2017.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;


    public VipCustomer() {
        this(null, 0, null);
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown");
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
