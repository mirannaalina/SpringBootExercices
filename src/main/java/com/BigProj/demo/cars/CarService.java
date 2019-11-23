package com.BigProj.demo.cars;

import com.BigProj.demo.address.Address;
import org.springframework.stereotype.Component;

//@Component  ori aveam component , ori avem un config file unde metoda dinuntru o punem cu @bean si o stabilim noi
public class CarService {

    private final Car defaultCar;


    public CarService(Car car) {
       // System.out.println("CarService Constructor");
        this.defaultCar= car;
    }

    public Car findbyName(String name){
        switch (name){
            case "dacia" : return new Car("Dacia",2000);
            case "bmw" : return  new Car("bmw",2009);
            default :
                return defaultCar;
        }
    }
}
