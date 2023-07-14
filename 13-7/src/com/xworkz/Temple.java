package com.xworkz;

public class Temple {
	
	String name="Sri Vigneshwara Temple";
	PrasadaType type;
	String godName;
	boolean dailyPooji;
	
	void setPrasadaType(PrasadaType type) {
		this.type = type;
	}
	
	Temple(String godName, boolean dailyPooji){
		this.godName=godName;
		this.dailyPooji=dailyPooji;
	}
	
	void display() {
		System.out.println(name);
		System.out.println("Prasada Type : "+this.type);
		System.out.println("godName: "+this.godName);
		System.out.println("Daily Pooji?? : "+dailyPooji);
	}
	

}