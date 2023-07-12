package com.xworkz;

public class Apple {

	static String companyName;
	String ceo;
	static void methodStatic()
	{
		companyName="Apple";
	}
	Apple(String ceo)
	{
		this.ceo=ceo;
	}
	void display()
	{
		System.out.println("Static variable: "+companyName);
		System.out.println("Instance variable: "+ceo);
	}

}
