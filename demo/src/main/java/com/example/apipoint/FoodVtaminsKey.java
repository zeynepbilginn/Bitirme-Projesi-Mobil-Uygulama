package com.example.apipoint;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FoodVtaminsKey implements Serializable {
    @Column(name = "food_id")
    private
    Long foodId;

    @Column(name = "vitamin_id")
    private
    Long vitaminId;


    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public Long getVitaminId() {
        return vitaminId;
    }

    public void setVitaminId(Long vitaminId) {
        this.vitaminId = vitaminId;
    }


}