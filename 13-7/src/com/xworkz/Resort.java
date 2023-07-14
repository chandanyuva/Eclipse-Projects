package com.xworkz;

public class Resort {
	
	String name="Kruthika Resort";
	RoomType type;
	String ownerName;
	String breakFast;
	
	void setRoomType(RoomType type) {
		this.type = type;
	}
	
	Resort(String ownerName, String breakFast){
		this.ownerName=ownerName;
		this.breakFast=breakFast;
	}
	
	void display() {
		System.out.println(name);
		System.out.println("Resort Type : "+this.type);
		System.out.println("Owner Name : "+this.ownerName);
		System.out.println("Break Fast : "+breakFast);
	}
	
}
