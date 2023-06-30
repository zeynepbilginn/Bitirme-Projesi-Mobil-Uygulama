package com.example.apipoint;

public class FoodInTheMealDTO {
    private Integer id;
    private FoodDTO foodInMeal;
    private MealsDTO mealsFood;
    private Double food_quantity;
    private String food_unit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FoodDTO getFoodInMeal() {
        return foodInMeal;
    }

    public void setFoodInMeal(FoodDTO foodInMeal) {
        this.foodInMeal = foodInMeal;
    }

    public MealsDTO getMealsFood() {
        return mealsFood;
    }

    public void setMealsFood(MealsDTO mealsFood) {
        this.mealsFood = mealsFood;
    }

    public Double getFood_quantity() {
        return food_quantity;
    }

    public void setFood_quantity(Double food_quantity) {
        this.food_quantity = food_quantity;
    }

    public String getFood_unit() {
        return food_unit;
    }

    public void setFood_unit(String food_unit) {
        this.food_unit = food_unit;
    }
}
