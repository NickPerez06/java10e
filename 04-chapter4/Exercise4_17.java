/*
This porgram will prompt the user to enter a year and the first three letter of a month name.
(first letter must be upper case) and display the numbers of days in a month
Author: Nicholas Perez
*/

import java.util.Scanner;

public class Exercise4_17 {
	public static void main(String [] args) {

		//Scanner object and needed variables creation
		Scanner input = new Scanner(System.in);
		
		int year;
		String month;

		//reading input from user. must use next() to read string after reading in number from user
		System.out.print("Enter a year: ");
		year = input.nextInt();

		System.out.print("Enter a month: ");
		month = input.next();

		//if the user did not enter a month with the first letter capitalize, program will do the following below
		String first_letter = month.substring(0, 1);
		String rest_word = month.substring(1);

		first_letter = first_letter.toUpperCase();

		String Month = first_letter + rest_word;		

		//separting months with 30 days and 31 days
		String Thirtydays = "SepAprJunNov";
		String ThirtyOnedays = "JanMarMayJulAugOctDec";

		//checking to see if year is leap year or not
		if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
			
			if( month.equals("Feb") )
				System.out.println(Month + " " + year + " has 29 days");
			else
				System.out.println(Month + " " +  year + " has 28 days");
		}
		else {

			if( Thirtydays.contains(Month) )
				System.out.println(Month + " " + year + " has 30 days");
			else
				System.out.println(Month + " " + year + " has 31 days");
		}
	}
}
	
