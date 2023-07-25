package com.xworkz.village;

import com.xworkz.village.inner.OldVillage;
import com.xworkz.village.outer.NewVillage;

public class VillageRunner {

	public static void main(String[] args) {
		
		OldVillage oldVillage = new OldVillage();
		oldVillage.enter();
		oldVillage.exit();
		
		NewVillage newVillage = new NewVillage();
		newVillage.enter();
		newVillage.exit();
		
	}

}
