package com.objectedge.restroappproto.model;

/**
 * Created by deepak.verma on 13-01-2017.
 */
public class DishModel {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(double preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    Integer quantity = 1;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    String name;
    String ingredient;
    double price;
    double preparationTime;
    String imageUrl;
    String description;

    public static DishModel getDummyDish(){
        DishModel dish = new DishModel();
        dish.setName("Biryani");
        dish.setId("BK1");
        dish.setPrice(45.3);
        dish.setDescription("Rice ke sath khao paneer.");
        dish.setImageUrl("http://www.tasty-indian-recipes.com/wp-content/uploads/2012/06/Paneer-Biryani.jpg");
        dish.setIngredient("Rice, Paneer");
        dish.setPreparationTime(15);
        return dish;
    }
}
