/*
This program will display a random coordinate in a rectangle.
Note: retangle is centered at (0,0) with width anf height 200
Nicholas Perez
*/

public class Random {
	public static void main(String [] args) {

		int width_guess = (int)(Math.random() * 101);
		int height_guess = (int)(Math.random() * 201);

		System.out.println("The random coordinate for this rectangle is " + "("+ width_guess + "," + height_guess + ")" );
	}
}
