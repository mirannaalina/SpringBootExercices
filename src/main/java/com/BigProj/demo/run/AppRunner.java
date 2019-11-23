package com.BigProj.demo.run;

import com.BigProj.demo.person.Person;
import com.BigProj.demo.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    //main de a lui Spring, ca sa putem folosi bean-urile create de noi

    private final PersonService personService;

    @Autowired
    public AppRunner(PersonService personService) {
        this.personService =personService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("From Spring run");
        Person byCNP = personService.findByCNP(18900);
        System.out.println(byCNP.getAddress());
    }
}
