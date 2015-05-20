/*This program will prompt the user to enter a b c d e and f for solving a 2x2 linear equation using cramers rule.
If ad-bc = 0, it will say that there is no solution.

Note: Cramers rule for a 2x2 linear euqation:

x = ed-bf/(ad-bc)	y = af-ec/(ad-bc)
Nicholas Perez
*/

import java.util.Scanner;

public class Linear {
	public static void main(String [] args) {

		//Decalring variables and Scanner object
		double a, b, c, d, e, f, X, Y;
		Scanner input = new Scanner(System.in);

		//Asking for input and reading it in
		System.out.print("Enter a, b, c, d, e, f: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();

		//perforing calculations and displaying result
		X = (e * d - b * f) / (a * d - b * c);
		Y = (a * f - e * c) / (a * d - b * c);

		if( (a * d - b * c) == 0)
			System.out.println("The equation has no solution");
		else
			System.out.println("X si " + X + " and Y is " + Y);
	}
}
