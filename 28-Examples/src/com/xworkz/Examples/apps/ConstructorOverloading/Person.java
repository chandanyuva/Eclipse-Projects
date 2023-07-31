package com.xworkz.Examples.apps.ConstructorOverloading;

public class Person {
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public Person(String name) {
        this(name, 0); 
    }

    
    public Person() {
        this("", 0); 
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
