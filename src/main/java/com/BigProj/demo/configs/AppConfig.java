package com.BigProj.demo.configs;

import com.BigProj.demo.address.Address;
import com.BigProj.demo.address.ZipService;
import com.BigProj.demo.cars.CarService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppConfig {

    @Bean //stie ca o sa primeasca un bean de zipService ce noi il instantiem
    public ZipService getDefaultZipService(){
        Address defaultAdress= new Address("Unknown",3);
        return new ZipService(defaultAdress);
    }

}
