package com.example.apipoint;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "food_minerals")

public class FoodMinerals {
    @EmbeddedId
    private
    FoodMineralsKey id;

    @Column(name = "amount")
    private Double amount;

    @JsonManagedReference
    @ManyToOne
    @MapsId("foodId")
    @JoinColumn(name = "food_id", nullable = false)
    private Food foods;

    @JsonManagedReference
    @ManyToOne
    @MapsId("mineralId")
    @JoinColumn(name = "mineral_id", nullable = false)
    private Minerals minerals;

    public FoodMineralsKey getId() {
        return id;
    }

    public void setId(FoodMineralsKey id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Food getFood() {
        return foods;
    }

    public void setFood(Food food) {
        this.foods = food;
    }

    public Minerals getMinerals() {
        return minerals;
    }

    public void setMinerals(Minerals minerals) {
        this.minerals = minerals;
    }
}
