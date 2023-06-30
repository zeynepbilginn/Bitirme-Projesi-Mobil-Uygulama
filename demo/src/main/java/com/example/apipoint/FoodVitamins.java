package com.example.apipoint;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;


    @Entity
    @Table(name = "food_vitamins")

    public class FoodVitamins {
        @EmbeddedId
        private
        FoodVtaminsKey id;

        @JsonManagedReference
        @ManyToOne
        @MapsId("foodId")
        @JoinColumn(name = "food_id", nullable = false)
        private Food foods;

        @JsonManagedReference
        @ManyToOne
        @MapsId("vitaminId")
        @JoinColumn(name = "vitamin_id", nullable = false)
        private Vitamins vitamins;

        @Column(name = "amount")
        private Double amount;

        public FoodVtaminsKey getId() {
            return id;
        }

        public void setId(FoodVtaminsKey id) {
            this.id = id;
        }

        public Food getFoods() {
            return foods;
        }

        public void setFoods(Food foods) {
            this.foods = foods;
        }

        public Vitamins getVitamins() {
            return vitamins;
        }

        public void setVitamins(Vitamins vitamins) {
            this.vitamins = vitamins;
        }

        public Double getAmount() {
            return amount;
        }

        public void setAmount(Double amount) {
            this.amount = amount;
        }
    }

