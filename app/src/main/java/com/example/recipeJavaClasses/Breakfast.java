package com.example.recipeJavaClasses;
import java.util.ArrayList;

public class Breakfast extends IndividualFoodCategory {

    private ArrayList<Food> breakfast;

    public Breakfast(String title, String img, ArrayList<Food> breakfast) {
        super(title, img);
        this.breakfast = breakfast;
    }

    public ArrayList<Food> getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(ArrayList<Food> breakfast) {
        this.breakfast = breakfast;
    }
}
