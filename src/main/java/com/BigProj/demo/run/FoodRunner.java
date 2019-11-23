package com.BigProj.demo.run;

import com.BigProj.demo.food.Food;
import com.BigProj.demo.food.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FoodRunner implements CommandLineRunner {

    private final FoodService foodService;

    @Autowired
    public FoodRunner(FoodService foodService) {
        this.foodService = foodService;
    }

    @Override
    public void run(String... args) throws Exception {
        Food foundFood = foodService.findByName("orez");
        System.out.println(foundFood.toString());

    }
}
