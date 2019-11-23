package com.BigProj.demo.person;

import com.BigProj.demo.address.Address;
import com.BigProj.demo.address.ZipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component //bean

@Service  //seamana cu @component
public class PersonService {

    private final ZipService zipService;

    @Autowired //pe constructor
    public PersonService(ZipService zipService) {
        this.zipService = zipService;
       // System.out.println("PersonService constructor");
    }

    public Person findByCNP(int cnp){
        switch (cnp) {
            case 18907:
                Address address = zipService.findAddress(1);
                return new Person("Ciprian", address);

            case 28906:
                Address secondaddress = zipService.findAddress(3);
                return new Person("Andreea", secondaddress);
            case 18906:
                Address thirdaddress = zipService.findAddress(8);
                return new Person("Andreea", thirdaddress);
                default:
                    Address defaultaddress = zipService.findAddress(0);
                    return new Person("Andreea", defaultaddress);
        }
    }
}
