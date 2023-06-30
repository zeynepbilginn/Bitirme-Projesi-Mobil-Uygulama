package com.example.apipoint;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FoodMineralsKey implements Serializable {
    @Column(name = "food_id")
    private
    Long foodId;

    @Column(name = "mineral_id")
    private
    Long mineralId;

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public Long getMineralId() {
        return mineralId;
    }

    public void setMineralId(Long mineralId) {
        this.mineralId = mineralId;
    }
}
