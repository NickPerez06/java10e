/*This program will prompt the user to enter the velocity and acceleration and display the minimum runaway length

formula for runaway length needed = v^2/2a
Nicholas Perez
*/

import java.util.Scanner;

public class Runaway {
	public static void main(String [] args) {
		
		//Declaring variables for velocity and acceleration and Scanner object
		double velocity, acceleration, length;
		Scanner readin = new Scanner(System.in);

		//Reading values and performing calcualtions
		System.out.print("Enter speed and acceleration: ");
		velocity = readin.nextDouble();
		acceleration = readin.nextDouble();

		length = Math.pow(velocity, 2) / (2 * acceleration);
	
		//Displaying reuslt
		System.out.println("The minimum runaway length for this airplane is " + length);
	}
}
