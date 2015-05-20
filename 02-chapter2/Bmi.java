/*This program will prompt the user to enter a weight in ounds and height in inches adn displays the BMI.
one pund is 0.45359237 kilograms and one inch is 0.0254 meters.
Nicholas Perez
*/
	
import java.util.Scanner;

public class Bmi {
	public static void main(String [] args) {

		//declaring variables and a scanner object
		final double pound_in_kilos = 0.45359237;
		final double inch_in_meters = 0.0254;

		double weight, height, BMI;
		Scanner readin = new Scanner(System.in);

		//Asking for input and reading in value
		System.out.print("Enter the weight in pounds: ");
		weight = readin.nextDouble();
	
		System.out.print("Enter height in inches: ");
		height = readin.nextDouble();

		//Performing calculations and displaying results
		BMI = ( weight * pound_in_kilos ) / Math.pow( (height * inch_in_meters), 2);
		System.out.println("The BMI is " + BMI);
	}
}
