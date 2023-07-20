package com.xworkz.Case;

public class FamilyCourt extends CivilCourt {
	
	void divorceCase() {
		System.out.println("Running divorce Case in Familycourt");
	}
	
	@Override
	void propertyCase() {
		System.out.println("Running OVERRIDEN method propertyCase in FamilyCort");
	}
	@Override
	void theftCase() {
		System.out.println("Running OVERRIDEN method theftCase in FamilyCort");
	}
}
