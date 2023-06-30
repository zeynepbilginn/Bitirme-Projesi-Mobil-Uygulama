package com.example.apipoint;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MealsService {

    public List<MealsDTO> dtoMeal(List<Meals> entities) {
        List<MealsDTO> dtos = new ArrayList<>();
        for (Meals entity : entities) {
            MealsDTO dto = new MealsDTO();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setImage_url(entity.getImage_url());
            dto.setRecipe(entity.getRecipe());

            MealTypesDTO typesDto = new MealTypesDTO();
            typesDto.setId(entity.getMealTypes().getId());
            typesDto.setName(entity.getMealTypes().getName());
            dto.setMealTypes(typesDto);

            dtos.add(dto);
        }

        return dtos;
    }

}
