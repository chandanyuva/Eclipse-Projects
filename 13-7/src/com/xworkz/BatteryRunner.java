package com.xworkz;

public class BatteryRunner {

	public static void main(String[] args) {
		Battery battery1 = new Battery(20, 20);
		battery1.setBatteryType(BatteryType.ALKALINE);
		battery1.display();
		
		Battery battery2 = new Battery(55, 10);
		battery2.setBatteryType(BatteryType.LEAD_ACID);
		battery2.display();

	}

}
