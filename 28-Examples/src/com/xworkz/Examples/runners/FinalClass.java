package com.xworkz.Examples.runners;

final class Person {
	// final variables
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class FinalClass {
    public static void main(String[] args) {
        Person person = new Person("ram", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // creating subclass Person will result in a compilation error.
        // class AnotherPerson extends ImmutablePerson { }
    }
}
