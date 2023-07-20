package com.xworkz.Case;

public class CaseRunner {

	public static void main(String[] args) {
		System.out.println("Running main method in Case Runner");
		Court court1 = new Court();
	      court1.justice();
	      
	      System.out.println("-----------------------------------");
	      
	      Court court2 = new SupremCourt();
	      court2.justice();
	      
	      SupremCourt sup1 = new SupremCourt();
	      sup1.importantCase();
	      sup1.justice();
	      
	      System.out.println("-----------------------------------");
	      
	      Court court3 = new HighCourt();
	      court3.justice();
	      
	      SupremCourt sup2 = new HighCourt();
	      sup2.importantCase();
	      sup2.justice();
	      
	      HighCourt high1 = new HighCourt();
	      high1.criminalCase();
	      high1.forgeryCase();
	      high1.importantCase();
	      high1.justice();
	      
	      System.out.println("-----------------------------------");
	      
	      Court court4 = new CivilCourt();
	      court4.justice();
	      
	      SupremCourt sup3 = new CivilCourt();
	      sup3.importantCase();
	      sup3.justice();
	      
	      HighCourt high2 = new CivilCourt();
	      high2.justice();
	      high2.forgeryCase();
	      high2.importantCase();
	      high2.criminalCase();

	      CivilCourt civil = new CivilCourt();
	      civil.justice();
	      civil.criminalCase();
	      civil.propertyCase();
	      civil.forgeryCase();
	      civil.importantCase();
	      
	      System.out.println("-----------------------------------");
	      
	      Court court5 = new FamilyCourt();
	      court5.justice();
	      
	      SupremCourt sup4 = new FamilyCourt();
	      sup4.importantCase();
	      sup4.justice();
	      
	      HighCourt high3 = new FamilyCourt();
	      high3.justice();
	      high3.forgeryCase();
	      high3.importantCase();
	      high3.criminalCase();

	      CivilCourt civil1 = new FamilyCourt();
	      civil1.justice();
	      civil1.criminalCase();
	      civil1.propertyCase();
	      civil1.forgeryCase();
	      civil1.importantCase();
	      
	      FamilyCourt fam1 = new FamilyCourt();
	      fam1.criminalCase();
	      fam1.divorceCase();
	      fam1.forgeryCase();
	      fam1.importantCase();
	      fam1.justice();
	      fam1.propertyCase();

	}

}
