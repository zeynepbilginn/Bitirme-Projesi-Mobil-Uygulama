package com.example.apipoint;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vitamins")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Vitamins {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @JsonBackReference //just showing the desired values not extra
    @OneToMany(mappedBy = "vitamins")
    private Set<FoodVitamins> foodVitamins = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<FoodVitamins> getFoodVitamins() {
        return foodVitamins;
    }

    public void setFoodVitamins(Set<FoodVitamins> foodVitamins) {
        this.foodVitamins = foodVitamins;
    }
}