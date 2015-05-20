/*This program will convert a Celsius degree into a Farhrenhiet degree. User will be ask for input (i.e entering a celsius degree)
Nicholas Perez
*/

import java.util.Scanner;

public class Convert {
	public static void main(String [] args) {
	
		//creating scanner object
		Scanner input = new Scanner(System.in);

		//declaring variables
		double celsius, fahrenheit;

		//asking the user for input
		System.out.print("Enter a degree in Celsius: ");
		celsius = input.nextDouble();

		//performing conversion
		fahrenheit = (9.0/5) * celsius + 32;

		//Displaying result
		System.out.println( celsius +" "+ "Celsius is " + fahrenheit + " Fahrenheit" );
	}
}
		
