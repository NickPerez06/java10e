/*This program will ask the user to enter the eight in pounds, and their height.
However the height will be entered in feet with their inches.
Nicholas Perez
*/

import java.util.Scanner;

public class Bmi2 {
	public static void main(String [] args) {
	
		//constant varibles 
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;

		//Declaring variables and Scanner object
		double feet, inches, weight, BMI;
		Scanner input = new Scanner(System.in);

		//Asking user for input and reading it in
		System.out.print("Enter weight in pounds: ");
		weight = input.nextDouble();
	
		System.out.print("Enter feet: ");
		feet = input.nextDouble();

		System.out.print("Enter inches: ");
		inches = input.nextDouble();

		//perforing calculations and displaying results
		feet *= 12;					//converting feet to inches
		feet += inches;				//add the iniches the user put i to the current variable feet; overiding the previous number

		double newWeight = weight * KILOGRAMS_PER_POUND;
		double newHeight = feet * METERS_PER_INCH;

		BMI = newWeight / ( Math.pow(newHeight, 2) );
		
		System.out.println("BMI is " + BMI);

		if( BMI < 18.5)
			System.out.println("Underweight");
		
		else if ( BMI < 25 )
			System.out.println("Normal");

		else if ( BMI < 30 )
			System.out.println("Overweight");
		
		else
			System.out.println("Obese");
	}
}
		
