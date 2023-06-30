package com.example.apipoint;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "food_in_the_meal")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class FoodInTheMeal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonManagedReference("food-foodInTheMeal")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "food_id", nullable = false)
    //@JsonIdentityReference(alwaysAsId = true)
    private Food foodInMeal;

    @JsonManagedReference("meals-foodInTheMeal")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "meal_id", nullable = false)
   // @JsonIdentityReference(alwaysAsId = true)
    private Meals mealsFood;


    @Column(name = "quantity")
    private Double food_quantity  ;

    @Column(name = "unit ")
    private String food_unit   ;



    public Food getFood() {
        return foodInMeal;
    }

    public void setFood(Food food) {
        this.foodInMeal = food;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Meals getMealsFood() {
        return mealsFood;
    }

    public void setMealsFood(Meals mealsFood) {
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


