package com.example.apipoint;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FoodSeasonsKey implements Serializable {
    @Column(name = "food_id")
    private
    Long foodId;

    @Column(name = "season_id")
    private
    Long seasonId;

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public Long getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Long seasonId) {
        this.seasonId = seasonId;
    }
}
