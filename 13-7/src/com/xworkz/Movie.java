package com.xworkz;

public class Movie {
	
	String name="Prashanth neel";
	MovieType type;
	String hero;
	int mins;
	
	void setMovieType(MovieType type) {
		this.type = type;
	}
	
	Movie(String hero, int mins){
		this.hero=hero;
		this.mins=mins;
	}
	
	void display() {
		System.out.println("Director : "+name);
		System.out.println("Movie Type : "+this.type);
		System.out.println("hero  : "+this.hero);
		System.out.println("No of hrs : "+mins);
	}
	

}