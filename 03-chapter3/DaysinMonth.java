/*
This program will ask the user to enter the number of the month and its year and display to the user
how many days there are in that month in that particular
Nicholas Perez
*/

import java.util.Scanner;

public class DaysinMonth {
	public static void main(String [] args) {

		//setting variables and scanner object;
		int month, year;
		Scanner input = new Scanner(System.in);

		//prompting user and reading in values
		System.out.print("Enter the month's number and year: ");
		month = input.nextInt();
		year = input.nextInt();

		//performing calculations
		//check if year is a leap year first

		

		if( (year%4 == 0 && year%100 !=0) || (year%400 == 0) ) {
			if(month == 2)
				System.out.println("Feburary " + year + " has 29 days");
			
			else if(month == 2 && !(year%4 == 0 && year%100 !=0) || (year%400 == 0) )
				System.out.println("Feburary " + year + " has 28 days");
		

			else if (month == 1)
				System.out.println("January " + year + " has 31 days");
		
			else if (month == 3)
				System.out.println("March " + year + " has 31 days");
	
			else if (month == 4)
				System.out.println("April " + year + " has 30 days");

			else if (month == 5)
				System.out.println("May " + year + " has 31 days");

			else if (month == 6)
				System.out.println("June " + year + " has 30 days");

			else if (month == 7)
				System.out.println("July " + year + " has 31 days");
	
			else if (month == 8)
				System.out.println("August " + year + " has 31 days");
		
			else if (month == 9)
				System.out.println("September " + year + " has 30 days");

			else if (month == 10)
				System.out.println("October " + year + " has 31 days");

			else if (month == 11)
				System.out.println("November " + year + " has 30 days");

			else if (month == 12)
				System.out.println("December " + year + " has 31 days");
		}
	}
}
