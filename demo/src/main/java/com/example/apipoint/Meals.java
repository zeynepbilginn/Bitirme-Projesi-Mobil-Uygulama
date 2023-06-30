package com.example.apipoint;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "meals")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Meals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "recipe")
    private String recipe;  //@TODO: TEXT KULLANILMIYOR DAHA UZUN BI SECENEK BULMAK GEREK

    @Column(name = "image_url")
    private String image_url ;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "meal_type_id", nullable = false)
    private MealTypes mealTypes;

    @JsonBackReference("meals-foodInTheMeal")//just showing the desired values not extra
    @OneToMany(mappedBy = "mealsFood")
    private Set<FoodInTheMeal> foodInTheMeal = new HashSet<>();

    @JsonBackReference //just showing the desired values not extra
    @OneToMany(mappedBy = "meals")
    private Set<MealTimesMeals> mealTimesMeals = new HashSet<>();

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

    public MealTypes getMealTypes() {
        return mealTypes;
    }

    public void setMealTypes(MealTypes mealTypes) {
        this.mealTypes = mealTypes;
    }


    public Set<FoodInTheMeal> getFoodInTheMeal() {
        return foodInTheMeal;
    }

    public void setFoodInTheMeal(Set<FoodInTheMeal> foodInTheMeal) {
        this.foodInTheMeal = foodInTheMeal;
    }

    public Set<MealTimesMeals> getMealTimesMeals() {
        return mealTimesMeals;
    }

    public void setMealTimesMeals(Set<MealTimesMeals> mealTimesMeals) {
        this.mealTimesMeals = mealTimesMeals;
    }
}
