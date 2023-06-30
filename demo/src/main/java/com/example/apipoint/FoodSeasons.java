package com.example.apipoint;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "food_seasons")

public class FoodSeasons {
    @EmbeddedId
    private
    FoodSeasonsKey id;

    @JsonManagedReference
    @ManyToOne
    @MapsId("foodId")
    @JoinColumn(name = "food_id")
    private Food foods;

    @JsonManagedReference
    @ManyToOne
    @MapsId("seasonId")
    @JoinColumn(name = "season_id")
    private Seasons seasons;

    public FoodSeasonsKey getId() {
        return id;
    }

    public void setId(FoodSeasonsKey id) {
        this.id = id;
    }

    public Food getFoods() {
        return foods;
    }

    public void setFoods(Food foods) {
        this.foods = foods;
    }

    public Seasons getSeasons() {
        return seasons;
    }

    public void setSeasons(Seasons seasons) {
        this.seasons = seasons;
    }
}
