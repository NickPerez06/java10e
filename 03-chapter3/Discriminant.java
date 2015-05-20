/*This program will prompt the user to enter vlaues of the discriminant to see if has two roots, one, or none at all.
Nicholas Perez
*/

import java.util.Scanner;

public class Discriminant {
	public static void main(String [] args) {
		
		//Declaring variables and Scanner objects
		double A, B, C, root1, root2, Discriminant;
		Scanner input = new Scanner(System.in);

		//Prompting the user and reading in values
		System.out.print("Enter a, b, c: ");
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		//Perfroming calculations, then displaying result
		Discriminant = Math.pow(B,2) - 4 * A * C;
		
		root1 = (-B + Math.pow(Discriminant, 0.5)) / ( 2 * A );
		root2 = (-B - Math.pow(Discriminant, 0.5)) / ( 2 * A );

	
		if(Discriminant > 0) {
			
			System.out.println("The equation has two roots "+ root1 +" and " + root2);
		}
	
		else if (Discriminant == 0) {
			
			if(root1 == 0)
				System.out.println("The equation has one root "+ root2);

			else
				System.out.println("The equation has one root "+ root1);

		}

		else
			System.out.println("The equation has no real roots");
	}
}
