package com.xworkz_water;

public class Bottle {
	String bottle="Hot water";
	public static void main(String[] args) {
		
		glass();
		String ref=fiber("bottle");
		System.out.println(ref);
	}
	static void glass() {
		System.out.println("Invoking static mathod");	
	}
	static String fiber(String bottle) {
		System.out.println("Cold water ");
		return bottle;
	}
	
}
