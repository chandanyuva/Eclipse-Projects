package com.xworkz;

public class TheaterRunner {

	public static void main(String[] args) {
		Theater theater1 = new Theater(200,"K3G");
		theater1.setSeatType(SeatType.AC_SEAT);
		theater1.display();
		
		Theater theater2 = new Theater(100,"Ranna");
		theater2.setSeatType(SeatType.GANDHI_CLASS);
		theater2.display();

	}

}