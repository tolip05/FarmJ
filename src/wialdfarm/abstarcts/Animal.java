package wialdfarm.abstarcts;

import wialdfarm.foods.Food;

public abstract class Animal {
    private String animalName;

    private String animalType;

    private Double animalWeight;

    private Integer foodEaten;

    public Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;

    }

    protected final String getAnimalName() {
        return this.animalName;
    }

    protected final String getAnimalType() {
        return this.animalType;
    }

    protected final Double getAnimalWeight() {
        return this.animalWeight;
    }

    protected final Integer getFoodEaten() {
        return this.foodEaten;
    }

    protected void setFoodEaten(int foodEaten) {
        this.foodEaten += foodEaten;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);
}
