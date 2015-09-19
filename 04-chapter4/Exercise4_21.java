/*
This program will ask the user to enter a Social Security number in the follwoing format:
DDD-DD-DDDD. It then will check to see if it is in the right format noted before.
Nicholas Perez
*/

import java.util.Scanner;

public class Exercise4_21 {
	public static void main(String[] args) {

		//Creating string variables as needed and Scanner object
		String SSN;
		Scanner input = new Scanner(System.in);

		//prompting user for input
		System.out.print("Enter a SSN: ");
		SSN = input.nextLine();

		//checking to see if SSN number is in valid format
		if ( SSN.substring(0, 4).contains("-") && SSN.substring(6, 7).contains("-") )
			System.out.println(SSN + " is a valid social security number");

		else
			System.out.println(SSN + " is an invalid social security number");
	}
}
