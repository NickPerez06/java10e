/*
This program will reads three edges fo a triangle and compute the perimeter if the input is valid or not.
The input is valid if the sum of every  pair of two edges is greater than the remaining edge.
Nicholas Perez
*/

import java.util.Scanner;

public class Triangle {
	public static void main(String [] args) {
		
		//interger vaiables and scanner object
		int sideA, sideB, sideC;
		Scanner input = new Scanner(System.in);
	
		//promting user and reading in values
		System.out.print("Enter the 3 sides for your triangle(separated by spaces): ");
		sideA = input.nextInt();
		sideB = input.nextInt();
		sideC = input.nextInt();

		//checking if perimeter is valid or not
		
		if( (sideA+sideB>=sideC) && (sideB+sideC>=sideA) && (sideC+sideA>= sideB) )
			System.out.println("The input is valid. The result is " + (sideA + sideB + sideC) );
		else
			System.out.println("Input is invalid.");
	}
}
