/*This program will promt the user to enter the number of years and displays the population after the number of years.

one brith every 7 seconds
one death every 13 seconds
one new immigrant every 45 seconds

population starts at 312,032,486
Nicholas Perez
*/

import java.util.Scanner;

public class Population2 {
	public static void main (String [] args) {
		
		//declaring variables and scanner object
		int num_of_years;
		Scanner readin = new Scanner(System.in);

		//reading in value and performing calculations
		System.out.print("Enter the number of years: ");
		num_of_years = readin.nextInt();

		//performing calculations and displaying result
		double result = (312032486 +  ((31536000.0/7) - (31536000.0/13) + (31536000.0/45)) * num_of_years);
		
		System.out.println("The population in " +num_of_years+ " years is " + (int)result);
	}
}
