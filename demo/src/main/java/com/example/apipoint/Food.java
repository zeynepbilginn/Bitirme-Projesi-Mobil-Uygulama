package com.example.apipoint;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "food")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "fat")
    private Double fat;

    @Column(name = "carbohydrates")
    private Double carbohydrates;

    @Column(name = "protein")
    private Double protein;

    @Column(name = "price")
    private Double price;

    @Column(name = "image_url")
    private String image_url ;

    @Column(name = "food_quantity")
    private Double food_quantity  ;

    @Column(name = "food_unit ")
    private String food_unit   ;

    @JsonBackReference //just showing the desired values not extra
    @OneToMany(mappedBy = "food")
    private Set<FoodDietTypes> foodDietTypes = new HashSet<>();

    @JsonBackReference("food-foodInTheMeal") //just showing the desired values not extra
    @OneToMany(mappedBy = "foodInMeal")
    private Set<FoodInTheMeal> foodInTheMeal = new HashSet<>();

    @JsonBackReference //just showing the desired values not extra
    @OneToMany(mappedBy = "foods")
    private Set<FoodMinerals> foodMinerals = new HashSet<>();

    @JsonBackReference //just showing the desired values not extra
    @OneToMany(mappedBy = "foods")
    private Set<FoodSeasons> foodSeasons = new HashSet<>();

    @JsonBackReference //just showing the desired values not extra
    @OneToMany(mappedBy = "foods")
    private Set<FoodVitamins> foodVitamins = new HashSet<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
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


    public Set<FoodInTheMeal> getFoodInTheMeal() {
        return foodInTheMeal;
    }

    public void setFoodInTheMeal(Set<FoodInTheMeal> foodInTheMeal) {
        this.foodInTheMeal = foodInTheMeal;
    }

    public Set<FoodDietTypes> getFoodDietTypes() {
        return foodDietTypes;
    }

    public void setFoodDietTypes(Set<FoodDietTypes> foodDietTypes) {
        this.foodDietTypes = foodDietTypes;
    }

    public Set<FoodMinerals> getFoodMinerals() {
        return foodMinerals;
    }

    public void setFoodMinerals(Set<FoodMinerals> foodMinerals) {
        this.foodMinerals = foodMinerals;
    }

    public Set<FoodSeasons> getFoodSeasons() {
        return foodSeasons;
    }

    public void setFoodSeasons(Set<FoodSeasons> foodSeasons) {
        this.foodSeasons = foodSeasons;
    }

    public Set<FoodVitamins> getFoodVitamins() {
        return foodVitamins;
    }

    public void setFoodVitamins(Set<FoodVitamins> foodVitamins) {
        this.foodVitamins = foodVitamins;
    }
}