package com.example.apipoint;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
    @Table(name = "food_diet_types")
    public class FoodDietTypes {
    @EmbeddedId
    private
    FoodDietTypesKey id;


        @JsonManagedReference
        @ManyToOne
        @MapsId("foodId")
        @JoinColumn(name = "food_id", nullable = false)
        private Food food;

        @JsonManagedReference
        @ManyToOne
        @MapsId("dietTypeId")
        @JoinColumn(name = "diet_type_id", nullable = false)
        private DietTypes dietTypes;


        public Food getFood() {
            return food;
        }

        public void setFood(Food food) {
            this.food = food;
        }

        public DietTypes getDietTypes() {
            return dietTypes;
        }

        public void setDietTypes(DietTypes dietTypes) {
            this.dietTypes = dietTypes;
        }

    public FoodDietTypesKey getId() {
        return id;
    }

    public void setId(FoodDietTypesKey id) {
        this.id = id;
    }
}


