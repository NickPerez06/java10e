/*This program will ask the user to enter a number in feet, convert it to meters and displays the result.
Nicholas Perez
*/

import java.util.Scanner;

public class Convert2 {
	public static void main(String [] args) {

		//declare conversion to meters as constant
		final double METERS = 0.305;
	
		//needed variables
		double feet, conversion;
	
		//Scanner object and reading from user
		Scanner readin = new Scanner(System.in);
		
		System.out.print("Enter a value for feet: ");
		feet = readin.nextDouble();
		
		conversion = feet * METERS;

		//Displaying result
		System.out.println(feet + " feet is " + conversion + " meters");
	}
}
