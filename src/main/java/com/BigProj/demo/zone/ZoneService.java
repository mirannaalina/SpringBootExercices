package com.BigProj.demo.zone;

import com.BigProj.demo.address.ZipService;
import com.BigProj.demo.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ZoneService {
    private final ZipService zipService;
    private final PersonService personService;

    @Autowired
    public ZoneService(ZipService zipService, PersonService personService) {
        this.zipService = zipService;
        this.personService =personService;
        System.out.println("ZoneService Constructor");

        System.out.println(zipService.findAddress(2).getNumber());
        personService.findByCNP(122);
    }




}
