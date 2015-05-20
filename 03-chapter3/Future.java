/*This program will promt the user to enter an integer for today's day of the week, then ask the user
for the number days in the future and disply the the future day of the week
Nicholas Perez

Note: Sunday is 0, Monday is 1...Saturday is 6
*/

import java.util.Scanner;

public class Future {
	public static void main(String [] args) {
		
		//Declaring variables and Scanner object
		int present_day, future_day, result, future_result;
		Scanner input = new Scanner(System.in);

		//prompting the user for input
		System.out.print("Enter today's day: ");
		present_day = input.nextInt();

		System.out.print("Enter the number of days elapsed since today: ");
		future_day = input.nextInt();

		//peforming calculations
		result = (future_day) % 7;						//by modding future day by 7 days in the week you will get the remainder within 0-6
		future_result = result + present_day;			//This addition will add the remainder of result to present day to display the future day

		if( present_day == 0 )
			System.out.print("Today is Sunday and ");
		
		else if( present_day == 1 )
			System.out.print("Today is Monday and ");	
		
		else if( present_day == 2 )
			System.out.print("Today is Tuesday and ");

		else if( present_day == 3 )
			System.out.print("Today is Wednesday and ");

		else if( present_day == 4 )
			System.out.print("Today is Thursday and ");

		else if( present_day == 5 )
			System.out.print("Today is Friday and ");

		else if( present_day == 6 )
			System.out.print("Today is Saturday and ");
		

		if( future_result == 0 )
			System.out.println("the future day is Sunday");
		
		else if( future_result == 1 )
			System.out.println("the future day is Monday");	
		
		else if( future_result == 2 )
			System.out.println("the future day is Tuesday");

		else if( future_result == 3 )
			System.out.println("the future day is Wednesday");

		else if( future_result == 4 )
			System.out.println("the future day is Thursday");

		else if( future_result == 5 )
			System.out.println("the future day is Friday");

		else if( future_result == 6 )
			System.out.println("the future day is Saturday");
	}
}
		
