package com.xworkz;

public class TempleRunner {

	public static void main(String[] args) {
		Temple temple1 = new Temple("Ganesh",true);
		temple1.setPrasadaType(PrasadaType.LADDOO);
		temple1.display();
		
		Temple temple2 = new Temple("Lakshmi",true);
		temple2.setPrasadaType(PrasadaType.CURD_RICE);
		temple2.display();

	}

}