package com.xworkz.Examples.apps.SuperChaining;

public class Dog extends Animal {
    private String breed;

    public Dog(String species, String breed) {
        super(species);
        this.breed = breed;
    }

    public Dog setBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public String getBreed() {
        return breed;
    }
}
