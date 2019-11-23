package com.BigProj.demo.CarConfig;

import com.BigProj.demo.cars.Car;
import com.BigProj.demo.cars.CarService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCarConfig {

    @Bean //cand instantiem noi obiectele, prin metode
    public CarService getCarService(){
        Car defaultCar= new Car("Unknown",1999);
        return new CarService(defaultCar);

    }

}
