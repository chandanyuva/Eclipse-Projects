package com.xworkz;

public class MovieRunner {

	public static void main(String[] args) {
		Movie Movie1 = new Movie("Yash",2);
		Movie1.setMovieType(MovieType.ADVENTURE);
		Movie1.display();
		
		Movie Movie2 = new Movie("Prabhas", 3);
		Movie2.setMovieType(MovieType.EMOTIONAL);
		Movie2.display();

	}

}
