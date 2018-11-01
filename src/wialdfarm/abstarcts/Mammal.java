package wialdfarm.abstarcts;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{

    private String livingRegion;
    public Mammal(String animalName, String animalType, Double animalWeight,String livingTegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingTegion;
    }

    protected String getLivingRegion() {
        return this.livingRegion;
    }

    protected void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        return String.format("%S[%s %s %s %d]"
                ,super.getAnimalType()
        ,super.getAnimalName()
        ,new DecimalFormat("#.################")
        .format(super.getAnimalWeight())
        ,this.getLivingRegion()
        ,super.getFoodEaten());
    }
}
