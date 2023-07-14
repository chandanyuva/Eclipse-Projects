package com.xworkz;

public class Theater {
	
	String name="PVR ";
	SeatType type;
	int cost;
	String MovieName;
	
	void setSeatType(SeatType type) {
		this.type = type;
	}
	
	Theater(int cost, String MovieName){
		this.cost=cost;
		this.MovieName=MovieName;
	}
	
	void display() {
		System.out.println(name);
		System.out.println("Seat type : "+this.type);
		System.out.println("Cost of the seats : "+this.cost);
		System.out.println("Name of the movies : "+MovieName);
	}
	

}