package com.example.apipoint;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodInTheMealService {

    public List<FoodInTheMealDTO> dtoFoodMeal(List<FoodInTheMeal> entities) {

        List<FoodInTheMealDTO> dtos = new ArrayList<>();
        for (FoodInTheMeal entity : entities) {
            FoodInTheMealDTO dto = new FoodInTheMealDTO();
            dto.setId(entity.getId());
            dto.setFood_quantity(entity.getFood_quantity());
            dto.setFood_unit(entity.getFood_unit());

            FoodDTO foodDto = new FoodDTO();
            foodDto.setId(entity.getFood().getId());
            foodDto.setName(entity.getFood().getName());
            foodDto.setCarbohydrates(entity.getFood().getCarbohydrates());
            foodDto.setFat(entity.getFood().getFat());
            foodDto.setProtein(entity.getFood().getProtein());
            foodDto.setPrice(entity.getFood().getPrice());
            foodDto.setImage_url(entity.getFood().getImage_url());
            foodDto.setFood_quantity(entity.getFood().getFood_quantity());
            foodDto.setFood_unit(entity.getFood().getFood_unit());
            dto.setFoodInMeal(foodDto);

            MealsDTO mealsDto = new MealsDTO();
            mealsDto.setId(entity.getMealsFood().getId());
            mealsDto.setName(entity.getMealsFood().getName());
            mealsDto.setImage_url(entity.getMealsFood().getImage_url());
            mealsDto.setRecipe(entity.getMealsFood().getRecipe());

            dto.setMealsFood(mealsDto);

            MealTypesDTO mealTypesDto = new MealTypesDTO();
            mealTypesDto.setId(entity.getMealsFood().getMealTypes().getId());
            mealTypesDto.setName(entity.getMealsFood().getMealTypes().getName());

            mealsDto.setMealTypes(mealTypesDto);


            dtos.add(dto);
        }

        return dtos;
    }
}
