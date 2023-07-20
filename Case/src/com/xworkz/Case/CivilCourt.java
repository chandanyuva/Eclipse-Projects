package com.xworkz.Case;

public class CivilCourt extends HighCourt{
	
	void propertyCase() {
		System.out.println("Running propertyCase in CivilCort");
	}
	
	void theftCase() {
		System.out.println("Running theftCase in CivilCort");
	}
	
	@Override
	void criminalCase() {
		System.out.println("Running OVERRIDEN method CriminalCase in CivilCort");
	}
	
	@Override
	void forgeryCase() {
		System.out.println("Running OVERRIDEN method forgeryCase in CivilCort");
	}
}
