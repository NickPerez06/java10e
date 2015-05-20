/*This program will prompt the user to enter the minutes and display the number of years and days.
A year will be 365 days.
Nicholas Perez
*/

import java.util.Scanner;

public class Years {
	public static void main(String [] args) {

		//Declaring variables and Scanner object
		double minutes, years, days;
		Scanner READIN = new Scanner(System.in);

		//Prompting user and rading in the number
		System.out.print("Enter the number of minutes: ");
		minutes = READIN.nextDouble();
	
		//Performing calculations and displaying results
		years = minutes/(365.0*24.0*60.0);
		days = minutes%(365.0*24.0*60.0) / (24 * 60);

		System.out.println((int)minutes + " is approximately " + (int)years + " years and " + (int)days + " days");
	}
}
