package com.example.apipoint;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "meal_times_meals")
public class MealTimesMeals {
    @EmbeddedId
    private
    MealTimesMealsKey id;

    @JsonManagedReference
    @ManyToOne
    @MapsId("mealId")
    @JoinColumn(name = "meal_id", nullable = false)
    private Meals meals;

    @JsonManagedReference
    @ManyToOne
    @MapsId("mealtimeId")
    @JoinColumn(name = "meal_time_id", nullable = false)
    private MealTimes mealTimes;

    public MealTimesMealsKey getId() {
        return id;
    }

    public void setId(MealTimesMealsKey id) {
        this.id = id;
    }

    public Meals getMeals() {
        return meals;
    }

    public void setMeals(Meals meals) {
        this.meals = meals;
    }

    public MealTimes getMealTimes() {
        return mealTimes;
    }

    public void setMealTimes(MealTimes mealTimes) {
        this.mealTimes = mealTimes;
    }
}
