package com.example.apipoint;

public class FoodDTO {
    private Integer id;
    private String name;

    private String image_url ;
    private Double price;
    private Double protein;
    private Double carbohydrates;
    private Double fat;

    private Double food_quantity  ;

    private String food_unit   ;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getFood_quantity() {
        return food_quantity;
    }

    public void setFood_quantity(Double food_quantity) {
        this.food_quantity = food_quantity;
    }

    public String getFood_unit() {
        return food_unit;
    }

    public void setFood_unit(String food_unit) {
        this.food_unit = food_unit;
    }
}
