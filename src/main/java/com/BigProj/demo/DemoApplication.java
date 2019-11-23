package com.BigProj.demo;

import com.BigProj.demo.address.ZipService;
import com.BigProj.demo.person.PersonService;
import com.BigProj.demo.postal.PostalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);



		//dependency injection

		//fara

		// ZipService zipService = new ZipService();
		// PersonService personService = new PersonService(zipService);
		// PostalService postalService = new PostalService(zipService);

		//postalService.sendPackage(1);
		//postalService.sendPackage(2);
		//postalService.sendPackage(3);
	}

}
