package com.xworkz_water;

public class Method {

	public static void main(String[] args) {
		main(1);
		main(5,6.7);
		main(1,6.5568,9);
	}
	static void main(int a) {
		System.out.println("invoking 1st main");
	}
	static void main(int a,double b) {
		System.out.println("invoking 2nd main");
	}
	static void main(int a, double b, int c) {
		System.out.println("invoking 3rd main");
	}
}
