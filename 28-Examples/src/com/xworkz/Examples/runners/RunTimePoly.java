package com.xworkz.Examples.runners;
import com.xworkz.Examples.apps.RunTimePoly.*;

public class RunTimePoly {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();

		animal1.makeSound();
		animal2.makeSound();
	}
}
