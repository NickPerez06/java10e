/*This program will prompt the user to enter a temperature in Fahrenheit between -58F and 41F and then a velocity
greater than or equal to 2 and display the wind chill temperature

wind chill formula: 35.74 + 0.6215*T - 37.75*v^(0.16) + 0.4275*T*v^(0.16)
Nicholas Perez
*/

import java.util.Scanner;

public class Windchill {
	public static void main(String [] args) {
		
		//Declaring variables and scanner object
		double temperature, wind, result;
		Scanner read = new Scanner(System.in);

		//asking for user input and reading in values
		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		temperature = read.nextDouble();
		
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		wind = read.nextDouble();
	
		//performing calculations and displaying results
		result =  35.74 + 0.6215 * temperature  - 35.75 * Math.pow(wind, 0.16) + 0.4275 * temperature * Math.pow(wind,0.16);
		System.out.println("The wind chill index is " + result);
	}
}
