package com.example.user.foodtracker;

import android.util.Log;

/**
 * Created by user on 24/08/2016.
 */
public class NutrientCounter {

    public Float mTotal = 0.0f;

    public void count(String count){
        mTotal += Float.parseFloat(count);
    }

    public Float getTotal(){
        return mTotal;
    }

    public Float getRemainingRI(int nutritionRecommendation){
        return nutritionRecommendation - mTotal;
    }
}
