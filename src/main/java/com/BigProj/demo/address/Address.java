package com.BigProj.demo.address;

public class Address {

    private final String street;
    private final int number;

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public Address(String street, int number){
        this.street =street;
        this.number =number;


    }
}
