package com.xworkz.Examples.runners;
import com.xworkz.Examples.apps.Inheritence.ABS;
import com.xworkz.Examples.apps.Inheritence.Engines;
import com.xworkz.Examples.apps.Inheritence.SparkPlug;
public class InheritenceRunner {

	public static void main(String[] args) {

		Engines engine=new Engines();
		System.out.println("---------------------------\n");
		SparkPlug plug=new SparkPlug();
		System.out.println("---------------------------\n");
		ABS abs=new ABS();
	}

}
