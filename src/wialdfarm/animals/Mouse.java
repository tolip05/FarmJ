package wialdfarm.animals;

import wialdfarm.abstarcts.Mammal;
import wialdfarm.foods.Food;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, Double animalWeight, String livingTegion) {
        super(animalName, animalType, animalWeight, livingTegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
      if ("Vegetable".equals(food.getClass().getSimpleName())){
          super.setFoodEaten(food.getQuantity());
      }else{
          throw new IllegalArgumentException("Mouse are not eating that type of food!");
      }
    }
}
