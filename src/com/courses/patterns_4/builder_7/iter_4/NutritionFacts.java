package com.courses.patterns_4.builder_7.iter_4;

/**
 * Created by VSulevskiy on 28.08.2015.
 */
public class NutritionFacts {
    private int servingSize;  //ml            required
    private int servings;     //per container required
    private int calories;     //              optional
    private int fat;          //g             optional
    private int sodium;       //mg            optional
    private int carbonhydrate;//g             optional

    private NutritionFacts() {
    }

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getCarbonhydrate() {
        return carbonhydrate;
    }

    public void setCarbonhydrate(int carbonhydrate) {
        this.carbonhydrate = carbonhydrate;
    }

    public static class Builder {
        private int servingSize;  //ml            required
        private int servings;     //per container required
        private int calories;     //              optional
        private int fat;          //g             optional
        private int sodium;       //mg            optional
        private int carbonhydrate;//g             optional
        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories(int calories){
            this.calories = calories;
            return this;
        }
        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }
        public Builder sodium(int sodium){
            this.sodium = sodium;
            return this;
        }
        public Builder carbonhydrate(int carbonhydrate){
            this.carbonhydrate = carbonhydrate;
            return this;
        }
        public NutritionFacts build(){
            NutritionFacts nutritionFacts = new NutritionFacts();
            nutritionFacts.setServingSize(this.servingSize);
            nutritionFacts.setServings(this.servings);
            nutritionFacts.setCalories(this.calories);
            nutritionFacts.setFat(this.fat);
            nutritionFacts.setSodium(this.sodium);
            nutritionFacts.setCarbonhydrate(this.carbonhydrate);
            return nutritionFacts;
        }
    }

}
