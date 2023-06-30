package com.example.apipoint;

public class MealsDTO {
    private Integer id;
    private String name;

    private String recipe;

    private String image_url ;

    private MealTypesDTO mealTypes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public MealTypesDTO getMealTypes() {
        return mealTypes;
    }

    public void setMealTypes(MealTypesDTO mealTypes) {
        this.mealTypes = mealTypes;
    }
}
