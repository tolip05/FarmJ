package wialdfarm.factories;

import wialdfarm.foods.Food;
import wialdfarm.foods.Meat;
import wialdfarm.foods.Vegetable;

public class FoodFactory {
    public Food getFood(String[]tokens){
        String type = tokens[0];
        int quantity = Integer.parseInt(tokens[1]);
        switch (type.toLowerCase()){
            case "vegetable":
                return new Vegetable(quantity);
            case "meat":
                return new Meat(quantity);
                default:return null;
        }
    }
}
