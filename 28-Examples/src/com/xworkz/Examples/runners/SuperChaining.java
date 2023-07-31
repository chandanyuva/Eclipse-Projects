package com.xworkz.Examples.runners;
import com.xworkz.Examples.apps.SuperChaining.*;
public class SuperChaining {
    public static void main(String[] args) {
        Dog dog = new Dog("Canine", "Labrador");
        dog.setSpecies("Dog");
        dog.setBreed("Golden Retriever");

        System.out.println("Species: " + dog.getSpecies());
        System.out.println("Breed: " + dog.getBreed());
    }
}
