package com.example.recipeJavaClasses;
import java.util.ArrayList;

public class Lunch extends IndividualFoodCategory {

    private ArrayList<Food> lunch = new ArrayList<>();

    public Lunch(String title, String img, ArrayList<Food> lunch) {
        super(title, img);
        this.lunch = lunch;
    }

    public ArrayList<Food> getLunch() {
        return lunch;
    }

    public void setLunch(ArrayList<Food> lunch) {
        this.lunch = lunch;
    }
}

