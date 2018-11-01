package wialdfarm;

import wialdfarm.abstarcts.Animal;
import wialdfarm.factories.AnimalFactory;
import wialdfarm.factories.FoodFactory;
import wialdfarm.foods.Food;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String line ="";
        FoodFactory foodFactory = new FoodFactory();
        AnimalFactory animalFactory = new AnimalFactory();

        while (!"end".equalsIgnoreCase(line = br.readLine())){
            String[]animalTokens = line.split("\\s+");
            Animal animal = animalFactory.getAnimal(animalTokens);
            String[] foodTokens = br.readLine().split(" ");
            Food food = foodFactory.getFood(foodTokens);
            animal.makeSound();
            try{
                animal.eat(food);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            System.out.println(animal);
        }
    }
}
