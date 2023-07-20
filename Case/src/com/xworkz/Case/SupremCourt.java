package com.xworkz.Case;

public class SupremCourt extends Court{
	
	void importantCase() {
		System.out.println("Running Important Case method in SupremCourt class");
	}
	
	@Override
	void justice() {
		System.out.println("Running OVERRIDEN method justic in SupremCourt");
	}
}
