package com.BigProj.demo.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    private final Food defaultFood;

    @Autowired
    public FoodService(@Value("${default.food}") String defaultFoodName , //@value ia valorile predefinite in application.properties
                       @Value("${default.calories}") int defaultCalories){

       defaultFood =  new Food(defaultFoodName,defaultCalories);
       // System.out.println(defaultFood.toString());
    }

    public Food findByName(String name){
        switch (name){
            case " orez" : return new Food("orez",80);
            case "cartofi" : return new Food("cartofi",90);
            default: return defaultFood;

        }
    }
}
