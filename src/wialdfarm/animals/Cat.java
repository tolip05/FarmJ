package wialdfarm.animals;

import wialdfarm.abstarcts.Felime;
import wialdfarm.foods.Food;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingTegion
            , String breed) {
        super(animalName, animalType, animalWeight, livingTegion);
        this.breed = breed;
    }

    private String getBreed() {
        return this.breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
       super.setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        return String.format("%s[%s %s %s %s %d]"
                , super.getAnimalType()
                , super.getAnimalName()
                , this.getBreed()
                , new DecimalFormat("#.################")
                        .format(super.getAnimalWeight())
                , this.getLivingRegion()
                , super.getFoodEaten());
    }
}
