package com.xworkz.Examples.runners;

public class Casting {
    public static void main(String[] args) {
        // Implicit Casting
        int myInt = 10;
        double myDouble = myInt; // Implicit casting from int to double

        System.out.println("Implicit Casting:");
        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);

        // Explicit Casting
        double newDouble = 15.75;
        int newInt = (int) newDouble;

        System.out.println("\nExplicit Casting:");
        System.out.println("newDouble: " + newDouble); 
        System.out.println("newInt: " + newInt);
    }
}

