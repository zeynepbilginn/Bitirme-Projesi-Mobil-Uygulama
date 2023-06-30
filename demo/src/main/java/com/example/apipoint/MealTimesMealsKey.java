package com.example.apipoint;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class MealTimesMealsKey implements Serializable {
    @Column(name = "meal_id")
    private
    Long mealId;

    @Column(name = "meal_time_id")
    private
    Long mealtimeId;

    public Long getMealId() {
        return mealId;
    }

    public void setMealId(Long mealId) {
        this.mealId = mealId;
    }

    public Long getMealtimeId() {
        return mealtimeId;
    }

    public void setMealtimeId(Long mealtimeId) {
        this.mealtimeId = mealtimeId;
    }
}