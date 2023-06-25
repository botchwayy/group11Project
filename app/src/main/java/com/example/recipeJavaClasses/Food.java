package com.example.recipeJavaClasses;

public class Food {
    private String name;
    private String img;
    private String ingredients;
    private String instruction;

    public Food(String name, String img, String ingredients, String instruction) {
        this.name = name;
        this.img = img;
        this.ingredients = ingredients;
        this.instruction = instruction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}