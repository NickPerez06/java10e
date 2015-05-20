/*This program will prompt the user to enter a two pair of points and display the distance between them.
Formula for computing distance is ( (x2-x1)^2 + (y2-y1)^2 )^1/2.
Nicholas Perez
*/

import java.util.Scanner;

public class Distance {
	public static void main(String [] args) {
		
		//Declaring variables and scanner object	
		double x1, y1, x2, y2;
		Scanner number = new Scanner(System.in);
		
		//Reading in values and assigning them to proper variables.
		System.out.print("Enter x1 and y1: ");
		x1 = number.nextDouble();
		y1 = number.nextDouble();
	
		System.out.print("Enter x2 and y2: ");	
		x2 = number.nextDouble();
		y2 = number.nextDouble();

		//Performing calcualtions and displaying results
		double distance = Math.pow( (x2 - x1), 2) + Math.pow( (y2 - y1), 2);
		double result = Math.pow(distance, 0.5);

		System.out.println("The distance between the two points is "+ result);
	}
}	
