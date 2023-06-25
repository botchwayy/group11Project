package com.example.recipeJavaClasses;

import java.util.ArrayList;

public class Supper extends IndividualFoodCategory {

    private ArrayList<Food> supper = new ArrayList();

    public Supper(String title, String img, ArrayList<Food> supper) {
        super(title, img);
        this.supper = supper;
    }

    public ArrayList<Food> getSupper() {
        return supper;
    }

    public void setSupper(ArrayList<Food> supper) {
        this.supper = supper;
    }
}
