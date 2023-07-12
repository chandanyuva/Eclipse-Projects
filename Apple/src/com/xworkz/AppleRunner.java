package com.xworkz;

public class AppleRunner {
	
	public static void main(String[] args)
	{
		System.out.println("Running main method in AppleRunner..");
		Apple.methodStatic();
		Apple instance1 = new Apple("Tim Cook");
		instance1.display();
		Apple instance2 = new Apple("Steven Paul Jobs");
		instance2.display();
	}
}
