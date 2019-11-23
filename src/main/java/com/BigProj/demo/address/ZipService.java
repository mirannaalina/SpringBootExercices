package com.BigProj.demo.address;

import org.springframework.stereotype.Component;

//@Component  //bean
public class ZipService {

    private final Address defaultAdress;

    public ZipService(Address address) {
       // System.out.println("ZipService constructor");
        defaultAdress =address;
    }

    public Address findAddress(int zip) {
        switch (zip){
            case 1:
                return new Address("Remus",4);
            case 2:
                return new Address("Circumvalatiunii",7);
            case 3:
                return new Address("Gheorghe Lazar",9);
            default:
                return new Address("Unknown",0);

        }
    }
}
