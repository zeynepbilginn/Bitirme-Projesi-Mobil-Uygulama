package com.example.apipoint;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "minerals")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Minerals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;


    @JsonBackReference //just showing the desired values not extra
    @OneToMany(mappedBy = "minerals")
    private Set<FoodMinerals> foodMineralsSet = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public Set<FoodMinerals> getFoodMineralsSet() {
        return foodMineralsSet;
    }

    public void setFoodMineralsSet(Set<FoodMinerals> foodMineralsSet) {
        this.foodMineralsSet = foodMineralsSet;
    }
}


