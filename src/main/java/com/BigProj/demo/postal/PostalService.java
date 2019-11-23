package com.BigProj.demo.postal;

import com.BigProj.demo.address.Address;
import com.BigProj.demo.address.ZipService;
import com.BigProj.demo.person.Person;
import com.BigProj.demo.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //adnotarea component face ca springu sa stie ca e bean
public class PostalService {

    private final ZipService zipService;
    private final PersonService personService;

    @Autowired
    public PostalService(ZipService zipService, PersonService personService) {
        this.zipService = zipService;
       // System.out.println("PostalService constructor");
        this.personService = personService;
    }

    public void sendPackage(int zip){
        Address address = zipService.findAddress(zip);
        Person person = personService.findByCNP(189);
       // System.out.println("Sending package to "+ person.getName());
       // System.out.println("Sending package to street " + address.getStreet()+ " number "+ address.getNumber());
    }
}
