package com.example.apipoint;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FoodDietTypesKey implements Serializable {
    @Column(name = "food_id")
    private
    Long foodId;

    @Column(name = "diet_type_id")
    private
    Long dietTypeId;

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public Long getDietTypeId() {
        return dietTypeId;
    }

    public void setDietTypeId(Long dietTypeId) {
        this.dietTypeId = dietTypeId;
    }


}
