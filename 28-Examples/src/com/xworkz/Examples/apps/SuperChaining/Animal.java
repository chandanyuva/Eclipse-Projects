package com.xworkz.Examples.apps.SuperChaining;

public class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public Animal setSpecies(String species) {
        this.species = species;
        return this;
    }

    public String getSpecies() {
        return species;
    }
}