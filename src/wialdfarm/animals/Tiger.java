package wialdfarm.animals;

import wialdfarm.abstarcts.Felime;
import wialdfarm.foods.Food;

public class Tiger extends Felime {
    public Tiger(String animalName, String animalType, Double animalWeight, String livingTegion) {
        super(animalName, animalType, animalWeight, livingTegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
     if ("Meat".equals(food.getClass().getSimpleName())){
         super.setFoodEaten(food.getQuantity());
     }else{
         throw new IllegalArgumentException("Tiger are not eating that type of food!");
     }
    }
}
