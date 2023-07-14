package com.xworkz;

public class ResortRunner {

	public static void main(String[] args) {
		Resort Resort1 = new Resort("Kruthika","Nati chicken Roti");
		Resort1.setRoomType(RoomType.AC);
		Resort1.display();
		
		Resort Resort2 = new Resort("Bhumika","chapathi");
		Resort2.setRoomType(RoomType.DOUBLE_ROOM);
		Resort2.display();

	}

}