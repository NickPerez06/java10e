/*
This program will prompt the user to enter a year, monthm and day of the month and will display the name
of the day of the week.
Nicholas Perez
*/

import java.util.Scanner;

public class DayofWeek {
	public static void main(String [] args) {

		//Creating needed variables and Scanner object
		int H, Q, M;											//H is the day of the week, Q is the day of the month, M is the month,
		int J, K;												//J is the century, K is the year of the century	
																
		Scanner input = new Scanner(System.in);


		//prompting user for input and reading in values
		System.out.print("Enter the year: (e.g.., 2012): ");
		int year = input.nextInt();

		System.out.print("Enter month: 1-12: ");
		M = input.nextInt();

		//if the month they enter is Januaray or February must change it to 13 and 14, as well as well as the year by -1
	
		if ( M == 1 || M == 2) {
			M += 12;			//if month is 1 or 2	
			year -= 1;			//convert year to previous year
		}
		
		System.out.print("Enter the day of the month: 1-31: ");
		Q = input.nextInt();

		//performing calcualations and displaying results

		J = year/100;		//calculate Century
		K = year%100;		//calculate year of century

		H = ( Q + 26*(M + 1) / (10) + K + K / (4) + J / (4) + 5 * J ) % 7;

		switch(H) {

			case 0: System.out.println("Day of the week is Saturday"); break;
			case 1: System.out.println("Day of the week is Sunday"); break;
			case 2: System.out.println("Day of the week is Monday"); break;
			case 3: System.out.println("Day of the week is Tuesday"); break;
			case 4: System.out.println("Day of the week is Wednesday"); break;
			case 5: System.out.println("Day of the week is Thursday"); break;
			case 6: System.out.println("Day of the week is Friday"); break;
		}
	}
}
		
