package com.xworkz.Case;

public class HighCourt extends SupremCourt{
	
	void criminalCase() {
		System.out.println("Running CriminalCase in HighCort");
	}
	
	void forgeryCase() {
		System.out.println("Running forgeryCase in HighCort");
	}
	
	@Override
	void importantCase() {
		System.out.println("Running OVERRIDEN method importantCase in HighCourt");
	}
}
